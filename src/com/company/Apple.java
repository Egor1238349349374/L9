package com.company;

public class Apple implements Merchandise{
    private int rating;
    private String name;
    private int coast;

    public Apple(String name, int coast, int rating){
        this.name = name;
        this.coast = coast;
        this.rating = rating;
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
}
