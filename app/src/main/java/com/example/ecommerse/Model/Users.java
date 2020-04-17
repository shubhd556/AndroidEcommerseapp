package com.example.ecommerse.Model;

public class Users {

    private String Name,Password,phone,image, address;;

    public Users ()
    {

    }

    public Users(String name, String password, String phone, String image, String address)
    {
        Name = name;
        Password = password;
        this.phone = phone;
        this.image = image;
        this.address = address;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
