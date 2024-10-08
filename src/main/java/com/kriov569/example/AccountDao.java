package com.kriov569.example;

import java.util.Optional;

public interface AccountDao {

    Account addAccount(long amount);
    Optional<Account> findAccount(long accountId);
    Account getAccount(long  accountId);
    void setAmount(long accountId, long amount);
}