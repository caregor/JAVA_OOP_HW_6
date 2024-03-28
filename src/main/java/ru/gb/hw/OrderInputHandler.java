package ru.gb.hw;

public class OrderInputHandler {

    public OrderInputHandler() {}

    public Order getOrderFromConsole() {
        String clientName = prompt("Client Name: ");
        String product = prompt("Product: ");
        int quantity = Validator.promptInteger("Quantity: ");
        int price = Validator.promptInteger("Price: ");
        return new Order(clientName, product, quantity, price);
    }

    private String prompt(String message) {
        System.out.println(message);
        return Validator.scanner.nextLine();
    }

    public void closeScanner() {
        Validator.closeScanner();
    }
}