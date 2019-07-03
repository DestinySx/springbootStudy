package com.study.studyspringboot.redis.model;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: suxin
 * Date: 2019/7/2   Time: 21:01
 * Description:
 **/
public class User implements Serializable {

    private String username;
    private String password;
    private String nickname;
    private String age;
    private String gender;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
}