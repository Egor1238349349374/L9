package com.company;

public class Shop implements User{
    String username;
    String password;

    public Shop(String username, String password){
        this.username = username;
        this.password = password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    public void setUsername(String username, String password) {
        if (this.password.equals(password)){
            this.username = username;
        }
        else {
            System.out.println("неверный пароль");
        }
    }
}
