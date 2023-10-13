package com.yinyao.eurekaclient1.entity;

/**
 * @author yinyao
 * @title: Student
 * @projectName eureka_demo
 * @description: TODO
 * @date 2023/10/1118:16
 */
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
