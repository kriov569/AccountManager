package com.kriov569.example.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kriov569.example.Account;

public class AccountDto {

    @JsonProperty("accountId")
    private final long accountId;
    @JsonProperty("amount")
    private final long amount;

    public AccountDto(Account account) {
        this.accountId = account.getId();
        this.amount = account.getAmount();
    }

    public long getAccountId() {
        return accountId;
    }

    public long getAmount() {
        return amount;
    }
}