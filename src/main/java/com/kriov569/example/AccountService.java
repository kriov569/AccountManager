package com.kriov569.example;

public interface AccountService {

    void transfer(Account from, Account to, long amount);
    void transferByPhoneNumber(Account form, String phoneNumber, long amount);
}
