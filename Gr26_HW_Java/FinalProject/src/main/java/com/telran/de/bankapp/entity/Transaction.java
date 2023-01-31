package com.telran.de.bankapp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Instant;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Transaction {

    private Long Id;
    private Instant dateTime;
    private String type;
    private String accountFrom;
    private String accountTo;
    private BigDecimal amount;

}


