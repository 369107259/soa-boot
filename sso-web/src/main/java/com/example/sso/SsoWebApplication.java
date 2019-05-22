package com.example.sso;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Administrator
 */
@SpringBootApplication
@DubboComponentScan
public class SsoWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsoWebApplication.class, args);
    }

}
