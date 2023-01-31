package com.telran.de.bankapp.service;

import com.telran.de.bankapp.entity.Account;

import java.math.BigDecimal;
import java.util.List;

public interface AccountService {
    Account createAccount(Account account);

    List<Account> showListOfAccounts(String city);

    Account showAccountByID(String id);

    Account updateAccountByID(String id, Account account);
  void transferMoney(String idFrom, String idTo, BigDecimal amount);
}
