package com.telran.de.bankapp.service.implementation;

import com.telran.de.bankapp.entity.Account;
import com.telran.de.bankapp.entity.Transaction;
import com.telran.de.bankapp.entity.TransactionTypes;
import com.telran.de.bankapp.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccServiceImpl implements AccountService {

    private final List<Account> accounts = new ArrayList<>();

    @Override
    public Account createAccount(Account account) {
        Account account1 = Account.builder()
                .id(account.getId())
                .email(account.getEmail())
                .creationDate(account.getCreationDate())
                .firstName(account.getFirstName())
                .lastName(account.getLastName())
                .city(account.getCity())
                .country(account.getCountry())
                .amountOfMoney(account.getAmountOfMoney())
                .build();

        accounts.add(account1);
        return account1;
    }

    public List<Account> showListOfAccounts(String city) {
        if (city == null) {
            return accounts;
        }
        return accounts.stream()
                .filter(account -> account.getCity().equals(city))
                .collect(Collectors.toList());
    }

    @Override
    public Account showAccountByID(String id) {
        return accounts.stream()
                .filter(a -> a.getId().equals(id))
                .findAny()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }


    @Override
    public Account updateAccountByID(String id, Account acc) {
        Account account = showAccountByID(id);
        if (isPresent(id)) {
            account.setId(acc.getId());
            account.setEmail(acc.getEmail());
            account.setCreationDate(acc.getCreationDate());
            account.setFirstName(acc.getFirstName());
            account.setLastName(acc.getLastName());
            account.setCountry(acc.getCountry());
            account.setCity(acc.getCity());
            account.setAmountOfMoney(acc.getAmountOfMoney());

        }
        return account;
    }

    @Override
    public void transferMoney(String idFrom, String idTo, BigDecimal amount) {
        Account acc1 = showAccountByID(idFrom);
        Account acc2 = showAccountByID(idTo);
        if (!isPresent(idFrom) && !isPresent(idTo)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        if (showAccountByID(idFrom).getAmountOfMoney().compareTo(amount) >= 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        acc1.setAmountOfMoney(acc1.getAmountOfMoney().subtract(amount));
        acc2.setAmountOfMoney(acc2.getAmountOfMoney().add(amount));

        Transaction transaction = new Transaction();
        transaction.setType(String.valueOf(TransactionTypes.TRANSFER));
        transaction.setDateTime(Instant.now());
        transaction.setAccountFrom(idFrom);
        transaction.setAccountTo(idTo);
        transaction.setAmount(amount);
    }

    private boolean isPresent(String id) {
        boolean present = false;
        for (Account acc1 : accounts) {
            if (acc1.getId().equals(id))
                present = true;
            if (acc1 == null) {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND);
            }
        }
        return present;
    }

}
