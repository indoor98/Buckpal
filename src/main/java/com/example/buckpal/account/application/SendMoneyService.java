package com.example.buckpal.account.application;

import com.example.buckpal.account.application.port.in.SendMoneyCommand;
import com.example.buckpal.account.application.port.in.SendMoneyUseCase;
import com.example.buckpal.account.application.port.out.LoadAccountPort;
import com.example.buckpal.account.application.port.out.UpdateAccountStatePort;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
public class SendMoneyService implements SendMoneyUseCase {

    private final LoadAccountPort loadAccountPort;
    private final AccountLock accountLock;
    private final UpdateAccountStatePort updateAccountStatePort;

    @Override
    public boolean sendMoney(SendMoneyCommand command) {
        // TODO: 비지니스 규칙 검증
        // TODO: 모델 상태 조작
        // TODO: 출력 값 반환

        requireAccountExists(command.getSourceAccountId());
        requireAccountExists(command.getTargetAccountId());
    }
}