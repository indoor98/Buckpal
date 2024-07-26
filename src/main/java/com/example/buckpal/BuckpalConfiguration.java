package com.example.buckpal;


import com.example.buckpal.account.domain.Money;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(BuckpalConfigurationProperties.class)
public class BuckpalConfiguration {

    @Bean
    public MoneyTransferProperties moneyTransferProperties(BuckpalConfigurationProperties buckPalConfigurationProperties){
        return new MoneyTransferProperties(Money.of(buckPalConfigurationProperties.getTransferThreshold()));
    }
}
