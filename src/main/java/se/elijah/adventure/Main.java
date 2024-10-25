package se.elijah.adventure;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the game!");

        boolean running = true;
        while (running) {
            System.out.println("Enter 'Stop' to quit or 'Continue' to keep playing");
            // Read user input
            String userInput = scanner.nextLine().trim();

            if (userInput.equalsIgnoreCase("stop")) {
                running = false;
                System.out.println("Goodbye!");
            } else if (userInput.equalsIgnoreCase("continue")) {
                System.out.println("Which direction do you want to go? (go north, go south, go east, go west)");

                // Read direction input
                String direction = scanner.nextLine().trim(); // Trim whitespace for cleaner input

                // Validate the direction input using enhanced switch
                switch (direction.toLowerCase()) {
                    case "go north" -> System.out.println("On my way to north!");
                    case "go south" -> System.out.println("On my way to south!");
                    case "go east" -> System.out.println("On my way to east!");
                    case "go west" -> System.out.println("On my way to west!");
                    default -> System.out.println("Invalid input, please try again.");
                }
            } else {
                System.out.println("Invalid command, please enter 'Stop' or 'Continue'.");
            }
        }
        scanner.close();
    }
}
