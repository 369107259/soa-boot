package com.example.sso.service.impl;

import com.example.nozzle.IUserService;
import org.springframework.stereotype.Component;

/**
 * @Author 黄勇
 * @CreateTime 2019/6/1 16:04
 **/
@Component
@com.alibaba.dubbo.config.annotation.Service(group = "another")
public class AnotherServiceImpl implements IUserService {
    @Override
    public String getUser() {
        return "另一个测试实现类返回用户";
    }
}
