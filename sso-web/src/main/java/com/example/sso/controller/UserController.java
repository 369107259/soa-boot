package com.example.sso.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.common.result.JSONResult;
import com.example.entity.User;
import com.example.nozzle.IUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: soa-boot
 * @description: ${description}
 * @author: HuangYong
 * @create: 2019-04-23 22:12
 **/
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Reference
    private IUserService userService;

    @GetMapping("/get")
    public JSONResult getUsers(){
        String user = userService.getUser();
        return JSONResult.ok(user);
    }
}
