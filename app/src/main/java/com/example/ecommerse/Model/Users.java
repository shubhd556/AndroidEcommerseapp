package com.example.ecommerse.Model;

public class Users {

    private String Name,Password,phone;

    public Users ()
    {

    }

    public Users(String name, String password, String phone) {
        Name = name;
        Password = password;
        this.phone = phone;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
