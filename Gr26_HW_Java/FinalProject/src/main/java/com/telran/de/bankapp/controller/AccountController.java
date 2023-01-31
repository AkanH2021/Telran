package com.telran.de.bankapp.controller;

import com.telran.de.bankapp.entity.Account;
import com.telran.de.bankapp.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
//POST request to `/accounts`:
//
//        - creates a new account data record
//        - expects a valid account data object as its body payload, except that it does not have an id property
//        - adds the given object to the collection and assigns a unique long id to it
//        - the response code is 201 and the response body is the created record, including its unique id


@RestController
@AllArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @PostMapping("/accounts")
    @ResponseStatus(HttpStatus.CREATED)  //defining response status /http status code/ (Created = 201)
    public Account createAccount(@RequestBody Account account) {
        return accountService.createAccount(account);
    }

    @GetMapping("/accounts")
    @ResponseStatus(HttpStatus.OK)
    public List<Account> showAccount(@RequestParam(value = "date", required = false) String date,
                                     @RequestParam(value = "city", required = false) String city,
                                     @RequestParam(value = "sort", required = false) String sort) {
        return accountService.showListOfAccounts(city);
    }

    @GetMapping("/accounts/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Account showAccountByID(@PathVariable String id) {
        //   return new Account();
        return accountService.showAccountByID(id);
    }

    @PatchMapping("/accounts/update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Account updateAccountByID(@PathVariable String id, @RequestBody Account account) {
       return accountService.updateAccountByID(id, account);
    }

//    @PutMapping("/accounts/transfer")
//    @ResponseStatus(HttpStatus.OK)
//    public void transfersMoneyBetweenAccounts(@RequestParam(value = "from", required = true) String idFrom,
//                                              @RequestParam(value = "to", required = true) String idTo,
//                                              @RequestParam(value = "amount", required = true) BigDecimal amount) {
//        accountService.transferMoney(idFrom, idTo, amount);
//
//
//
//
//        }


    }

