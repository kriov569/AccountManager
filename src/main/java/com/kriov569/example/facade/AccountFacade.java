package com.kriov569.example.facade;

import com.kriov569.example.AccountDao;
import com.kriov569.example.AccountService;
import com.kriov569.example.controller.AccountDto;
import com.kriov569.example.controller.TransactionDto;
import com.kriov569.example.controller.TransactionResponse;
import com.kriov569.example.controller.TransactionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountFacade {

    private final AccountDao accountDao;
    private final AccountService accountService;

    @Autowired
    public AccountFacade(AccountDao accountDao, AccountService accountService) {
        this.accountDao = accountDao;
        this.accountService = accountService;
    }

    public AccountDto createAccount(long amount) {
        var account = accountDao.addAccount(amount);
        return new AccountDto(account);
    }

    public AccountDto getAccount(long accountId) {
        var account = accountDao.getAccount(accountId);
        return new AccountDto(account);
    }

    public TransactionResponse transfer(TransactionDto transactionDto) {
        accountService.transfer(
                transactionDto.getFromId(),
                transactionDto.getToId(),
                transactionDto.getAmount()
        );
        return new TransactionResponse(TransactionResult.SUCCESS);
    }
}