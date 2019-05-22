package com.example.entity;

/**
 * @program: soa-boot
 * @description: ${description}
 * @author: HuangYong
 * @create: 2019-04-21 10:34
 **/
public class BaseEntity {
    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    private String test;
    private String sky;

    public String getSky() {
        return sky;
    }

    public void setSky(String sky) {
        this.sky = sky;
    }
}
