package com.example.buckpal.account.application.port.in;

import com.example.buckpal.account.domain.Account;
import com.example.buckpal.account.domain.Money;

public interface GetAccountBalanceQuery {

    Money getAccountBalance(Account.AccountId accountId);
}
