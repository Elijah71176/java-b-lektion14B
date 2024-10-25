package se.elijah.adventure;

import java.util.Scanner;

public class Game {
    // Constants representing locations
    public static final String TOWN_CENTER = "Town Center";
    public static final String NORTH = "North";
    public static final String SOUTH = "South";
    public static final String EAST = "East";
    public static final String WEST = "West";

    // Variable to check currentposition.
    private String currentPosition;

    // Scanner for user input
    private Scanner scanner;

    //   control the game loop
    private boolean running;

    // Constructor for the Game class
    public Game() {
        this.currentPosition = TOWN_CENTER;  // Player starts in the Town Center
        this.scanner = new Scanner(System.in);  // Initialize scanner for user input
        this.running = true;
    }

    // Start the game
    public void start() {
        // show town center message
        printTownCentre();

        // show welcome message
        printWelcomeMsg();

        // Main game loop
        while (running) {
            String userInput = getUserInput();  // handle input from player
            running = processInput(userInput);  // Process input
        }
    }

    // welcome message to the player
    private void printWelcomeMsg() {
        System.out.println("\n Welcome to the adventure game \n");
        System.out.println("\n Use commands 'go north', 'go south', 'go east', 'go west', or 'quit' to stop.\n");
    }

    // Print the message for town center
    private void printTownCentre() {
        System.out.println("\n You are in the town square. What would you like to do next?\n");
    }

    // Processes the player's input and restricts movement.
    private boolean processInput(String input) {
        switch (input.toLowerCase()) {
            case "go north" -> {
                if (currentPosition.equals(TOWN_CENTER)) {
                    goNorth();
                    currentPosition = NORTH;
                } else {
                    System.out.println("\n You can only return to the town square from here. \n");
                }
            }
            case "go east" -> {
                if (currentPosition.equals(TOWN_CENTER)) {
                    goEast();
                    currentPosition = EAST;
                } else {
                    System.out.println("\n You can only return to the town square from here. \n");
                }
            }
            case "go south" -> {
                if (currentPosition.equals(TOWN_CENTER)) {
                    goSouth();
                    currentPosition = SOUTH;
                } else {
                    System.out.println("\n You can only return to the town square from here. \n");
                }
            }
            case "go west" -> {
                if (currentPosition.equals(TOWN_CENTER)) {
                    goWest();
                    currentPosition = WEST;
                } else {
                    System.out.println("\n You can only return to the town square from here. \n");
                }
            }
            case "go to town" -> {
                if (!currentPosition.equals(TOWN_CENTER)) {
                    System.out.println("\n You're heading back to the town square \n");
                    currentPosition = TOWN_CENTER;
                    printTownCentre();
                } else {
                    System.out.println("\n You are already in the town square. \n");
                }
            }
            case "quit" -> {
                System.out.println("\n Hope to see you again! \n");
                return false;
            }
            default -> System.out.println("\n Invalid input: try again \n");
        }
        return true;
    }

    // Method to get input from the player
    private String getUserInput() {
        System.out.print("Move around: ");
        return scanner.nextLine().trim().toLowerCase();
    }

    // Method to handle going north
    private void goNorth() {
        System.out.println("\n You walk north and see a vast forest. The trees sway gently in the wind. What do you want to do next? \n");
    }

    // Method to handle going east
    private void goEast() {
        System.out.println("\n You head east and encounter a beautiful river flowing quietly. The water glimmers in the sunlight. What do you want to do next? \n");
    }

    // Method to handle going south
    private void goSouth() {
        System.out.println("\n You walk south and arrive at a small village. The villagers seem friendly. What do you want to do next? \n");
    }

    // Method to handle going west
    private void goWest() {
        System.out.println("\n You head west and see a mountain range in the distance. The peaks are covered in snow. What do you want to do next? \n");
    }
}

