package com.example.buckpal.account.application.service;

import com.example.buckpal.account.application.port.in.GetAccountBalanceQuery;
import com.example.buckpal.account.application.port.out.LoadAccountPort;
import com.example.buckpal.account.domain.Account;
import com.example.buckpal.account.domain.Money;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
public class GetAccountBalanceService implements GetAccountBalanceQuery {

    private final LoadAccountPort loadAccountPort;

    @Override
    public Money getAccountBalance(Account.AccountId accountId) {
        return loadAccountPort.loadAccount(accountId, LocalDateTime.now())
                .calculateBalance();
    }



}
