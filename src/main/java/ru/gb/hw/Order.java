package ru.gb.hw;

public class Order {

    private String clientName;
    private String product;
    private int quantity;
    private int price;

    public Order(String clientName, String product, int quantity, int price) {
        this.clientName = clientName;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }
}
