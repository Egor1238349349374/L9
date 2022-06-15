package com.company;

public class Purchase implements Merchandise, User{
    private int rating;
    private String name;
    private int coast;
    private String username;

    public Purchase(Merchandise merchandise, User user) {
        this.name = merchandise.getName();
        this.coast = merchandise.getCoast();
        this.rating = merchandise.getRating();
        this.username = user.getUsername();
    }

    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public int getCoast() {
        return coast;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getUsername() {
        return username;
    }

    public void Buy(){
        System.out.printf("Пользователь %s купил товар %s", username, name);
    }
}
