package hw02;

import java.util.Random;
import java.util.Scanner;

public class Dz_2 {
    public static void main(String[] args) {
        int[][] field = new int[5][5];
        char[][] display = new char[5][5];
        printField(display);
        Random random = new Random();
        int targetRow = random.nextInt(5);
        int targetCol = random.nextInt(5);
        field[targetRow][targetCol] = 1;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int row = getCoordinate(scanner, "Enter row (1-5): ") - 1;
            int col = getCoordinate(scanner, "Enter column (1-5): ") - 1;

            if (row < 0 || row >= 5 || col < 0 || col >= 5) {
                System.out.println("Coordinates out of bounds. Try again.");
                continue;
            }

            if (field[row][col] == 1) {
                display[row][col] = 'x';
                printField(display);
                System.out.println("You have won!");
                break;
            } else {
                if (display[row][col] == '*') {
                    System.out.println("You already shot here. Try again.");
                    continue;
                }
                display[row][col] = '*';
            }

            printField(display);
        }
    }

    public static int getCoordinate(Scanner scanner, String prompt) {
        int coord;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                coord = scanner.nextInt();
                if (coord >= 1 && coord <= 5) {
                    return coord;
                } else {
                    System.out.println("Please enter a number from 1 to 5.");
                }
            } else {
                System.out.println("Please enter a valid number.");
                scanner.next();
            }

        }

    }
    public static void printField(char[][] display) {
        System.out.println("  | 1 | 2 | 3 | 4 | 5 |");
        for (int i = 0; i < display.length; i++) {
            System.out.print((i + 1) + " | ");
            for (int j = 0; j < display[i].length; j++) {
                System.out.print(display[i][j] + " | ");
            }
            System.out.println();
        }
    }
}

