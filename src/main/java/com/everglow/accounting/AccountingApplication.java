package com.everglow.accounting;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @ClassName AccountingApplication
 * @Decripiton
 * @Author Everglow
 * @Date 2020/10/26 17:27
 * @Version 1.0
 **/
@EnableAsync
@SpringBootApplication
@MapperScan("com.everglow.accounting.modules.mapper")
@EntityScan("com.everglow.accounting.modules.entity")
public class AccountingApplication {
    public static void main(String[] args) {

        SpringApplication.run(AccountingApplication.class, args);
    }

}
