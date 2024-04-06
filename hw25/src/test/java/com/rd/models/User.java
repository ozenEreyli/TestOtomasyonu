package com.rd.models;

public class User {

    public String userName;
    public String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public User() {
    }

    public String GetUserName() {
        return userName;
    }

    public void SetUserName(String userName) {
        this.userName = userName;
    }

    public String GetPassword() {
        return password;
    }

    public void SetPassword(String password) {
        this.password = password;
    }
}
