package ru.gb.hw;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class OrderExporter {

    public void exportToJson(Order order, String fileName) {
        try (FileWriter writer = new FileWriter(fileName, false)) {
            Gson gson = new Gson();
            String json = gson.toJson(order);
            writer.write(json);
        } catch (IOException ex) {
            System.out.println("Error while writing to file: " + ex.getMessage());
        }
    }
}

