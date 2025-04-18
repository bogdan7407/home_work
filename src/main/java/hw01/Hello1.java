package hw01;

import java.util.Scanner;

public class Hello1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Let the game begin!");
        int randomNumber = (int) (Math.random() * 101);

        int[] arr = new int[100];
        int counter = 0;

        while (true) {
            System.out.print("Enter your guess: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                scanner.next();
                continue;
            }
            int number = scanner.nextInt();
            if (counter < arr.length) {
                arr[counter] = number;
                counter++;
            }

            if (number == randomNumber) {
                System.out.println("Congratulations, " + name + "!");
                break;
            } else if (number < randomNumber) {
                System.out.println("Your number is too small. Please, try again.");
            } else {
                System.out.println("Your number is too big. Please, try again.");
            }
        }

        System.out.println("\nThe number of your attempts: " + counter);
        System.out.println("Your numbers: ");
        for (int i = 0; i < counter; i++) {
            System.out.printf("%-4d", arr[i]);
        }
    }
}
