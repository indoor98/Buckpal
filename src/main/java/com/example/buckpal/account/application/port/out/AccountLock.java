package com.example.buckpal.account.application.port.out;

import com.example.buckpal.account.domain.Account;

public interface AccountLock {

    void lockAccount(Account.AccountId accountId);
    void releaseAccount(Account.AccountId accountId);
}
