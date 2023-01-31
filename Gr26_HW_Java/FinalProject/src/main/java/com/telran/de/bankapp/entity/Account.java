package com.telran.de.bankapp.entity;

import lombok.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Instant;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@Entity
public class Account {
    private String id;
    private String email;
    private Instant creationDate;
    private String firstName;
    private String lastName;
    private String country;
    private String city;
    private BigDecimal amountOfMoney;
    //   private List<Transaction> transactions;

}
