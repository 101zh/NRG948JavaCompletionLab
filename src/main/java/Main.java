// Don't FORGET YOUR IMPORTS!!! (for both turtle and scanner)
// example import: ``import foldername.classname``

import java.util.Scanner;
import Animals.Turtle;

/**
 * The class where main software loop is ran.
 */
public final class Main {

    static Turtle turtle;

    /**
     * The firt method run for this application.
     * 
     * @param args The command line arguments.
     **/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        System.out.println(Turtle.turtleDescription);
        System.out.println("\n\n\nWelcome to turtle interactor!!");

        System.out.println("It's time to create your turtle!");
        createTurtle(scanner);

        while (!userInput.equals("exit")) {
            System.out.println("\n\nWhat would you like to do?");
            System.out.println("1: View Your Turtle's Characteristics\n" +
                    "2: Create a new Turtle\n" +
                    "3: Feed Your Turtle\n" +
                    "4: Let Your Turtle Laze\n");

            userInput = scanner.nextLine();
            System.out.println();
            if (userInput.equals("1")) {
                System.out.println("Name: " + turtle.getName() +
                        "\nAge: " + turtle.getAge() +
                        "\nAngry: " + turtle.getAngry() +
                        "\nFavorite Food: " + turtle.getFavoriteFood());
            } else if (userInput.equals("2")) {
                createTurtle(scanner);
            } else if (userInput.equals("3")) {
                System.out.println("What food?");
                String food = scanner.nextLine();
                System.out.println("How much?");
                int quantity = scanner.nextInt();
                scanner.nextLine();
                turtle.eat(quantity, food);
            } else if (userInput.equals("4")) {
                System.out.println("How long (in hours)?");
                Double duration = scanner.nextDouble();
                scanner.nextLine();
                turtle.laze(duration);
            }
        }

        scanner.close();
    }

    public static void createTurtle(Scanner scanner) {
        System.out.println("What is its name?");
        String nameTurtle = scanner.nextLine();
        System.out.println("What is its age? (# w/o decimal)");
        int ageTurtle = scanner.nextInt();
        System.out.println("Is it angry? (true/false)");
        boolean angryTurtle = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("What is its favorite food?");
        String foodTurtle = scanner.nextLine();

        turtle = new Turtle(ageTurtle, angryTurtle, nameTurtle, foodTurtle);
    }
}
