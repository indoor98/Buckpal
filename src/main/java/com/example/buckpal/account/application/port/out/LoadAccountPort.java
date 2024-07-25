package com.example.buckpal.account.application.port.out;

import com.example.buckpal.account.domain.Account;
import com.example.buckpal.account.domain.Account.AccountId;

import java.time.LocalDateTime;

public interface LoadAccountPort {

    Account loadAccount(AccountId accountId, LocalDateTime baselineDate);
}
