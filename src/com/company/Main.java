package com.company;

public class Main {

    public static void main(String[] args) {
        Table table = new Table("стол", 1200, 3);
        Apple apple = new Apple("яблоки кг.",50,5);
        Pen pen = new Pen("ручка",10,6);
        Buyer buyer = new Buyer("Masha", "1234");
        Wholesaler wholesaler = new Wholesaler("Чел", "1243");
        Shop shop = new Shop("Семёрочка", "ааа3");
        Purchase purchase = new Purchase(apple, buyer);
        purchase.Buy();
    }
}
