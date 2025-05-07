package hw03;

import java.util.Scanner;

public class Dz_3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[][] schedule = {
                    {"Sunday", "Go hiking"},
                    {"Monday", "Work on Java project"},
                    {"Tuesday", "Gym workout"},
                    {"Wednesday", "Study English"},
                    {"Thursday", "Team meeting"},
                    {"Friday", "Watch a movie"},
                    {"Saturday", "Relax and clean house"}
            };
            System.out.println("Enter day of the week or number : ");
            for (int i = 0; i < schedule.length; i++) {
                System.out.println(i+1 +". "+ schedule[i][0]);
            }
            String day = scanner.nextLine().trim();
            switch (day.toLowerCase()){

                case "sunday", "1":
                    System.out.println(schedule[0][1]);
                    break;
                case "monday", "2":
                    System.out.println(schedule[1][1]);
                    break;
                case "tuesday", "3":
                    System.out.println(schedule[2][1]);
                    break;
                case "wednesday", "4":
                    System.out.println(schedule[3][1]);
                    break;
                case "thursday", "5":
                    System.out.println(schedule[4][1]);
                    break;
                case "friday", "6":
                    System.out.println(schedule[5][1]);
                    break;
                case "saturday","7":
                    System.out.println(schedule[6][1]);
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again");
            }
        }
    }

