package com.kriov569.example;

import java.util.Optional;

public interface PhoneToAccountResolver {

    Optional<Account> findAccountByPhoneNumber(String phoneNumber);
    void addMapping(String phoneNumber, Account account);
    void removeMapping(String phoneNumber);

}