package ru.gb.hw;

public class Main {
    public static void main(String[] args) {
        OrderInputHandler inputHandler = new OrderInputHandler();
        Order order = inputHandler.getOrderFromConsole();
        inputHandler.closeScanner();

        OrderExporter exporter = new OrderExporter();
        exporter.exportToJson(order, "order.json");
    }
}