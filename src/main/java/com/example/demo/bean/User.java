package com.example.demo.bean;

/**
 * @author caib
 * @Package com.example.demo.bean
 * @data 2020-9-6 17:19
 * @description user实体类
 */
public class User {
    private String name;
    private int age;

    public User() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
