package com.gupaoedu.study.first.starterDemo;

/**
 * Created with IntelliJ IDEA.
 * User: suxin
 * Date: 2019/7/15   Time: 22:37
 * Description:
 **/
public class UserDemo {

    private String name;
    private int age;

    @Override
    public String toString() {
        return "UserDemo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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