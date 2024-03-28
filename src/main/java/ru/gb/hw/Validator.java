package ru.gb.hw;

import java.util.Scanner;

public abstract class Validator {
    static final Scanner scanner = new Scanner(System.in);

    public static int promptInteger(String message) {
        while (true) {
            try {
                System.out.println(message);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }
    public static void closeScanner() {
        scanner.close();
    }
}
