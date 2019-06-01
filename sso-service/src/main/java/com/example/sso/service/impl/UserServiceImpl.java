package com.example.sso.service.impl;

import com.example.dao.mapper.UserMapper;
import com.example.nozzle.IUserService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @program: soa-boot
 * @description: ${description}
 * @author: HuangYong
 * @create: 2019-04-23 22:02
 **/
@Component
@com.alibaba.dubbo.config.annotation.Service(group = "user")
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public String getUser() {
        return "返回测试用户";
    }
}
