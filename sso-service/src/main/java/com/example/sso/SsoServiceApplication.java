package com.example.sso;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Administrator
 */
@SpringBootApplication
@EnableAspectJAutoProxy
@EnableTransactionManagement
@EnableDubbo
@MapperScan("com.example.dao.mapper")
public class SsoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsoServiceApplication.class, args);
    }

}


