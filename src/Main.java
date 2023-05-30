import java.util.Random;
import java.util.Scanner;

public class Main {
    public static class AsciiChars {
        public static void printNumbers() {
            // TODO: print valid numeric input
            for (int i = 48; i <= 57; i++) {
                System.out.print((char) i + " ");
            }
            System.out.println();
        }

        public static void printLowerCase() {
            // TODO: print valid lowercase alphabetic input
            for (int i = 97; i <= 122; i++) {
                System.out.print((char) i + " ");
            }
            System.out.println();
        }

        public static void printUpperCase() {
            // TODO: print valid uppercase alphabetic input
            for (int i = 65; i <= 90; i++) {
                System.out.print((char) i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner usrIn = new Scanner(System.in);

        // print the valid characters for input
        AsciiChars.printNumbers();      // Print valid numeric input
        AsciiChars.printUpperCase();    // Print valid uppercase alphabetic input
        AsciiChars.printLowerCase();    // Print valid lowercase alphabetic input

        System.out.println("What is your name?");
        String userName = usrIn.next();  // Read user's name
        System.out.println("Hello, " + userName + "!");

        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Would you like to continue with the survey? (yes, no)");
            String optIn = usrIn.next();    // Read user's choice to continue or not

            if (optIn.equalsIgnoreCase("yes") || optIn.equalsIgnoreCase("y")) {
                System.out.println("Do you have a red car? (yes, no)");
                String redCar = usrIn.next();   // Read user's response about having a red car

                System.out.println("What is the name of your pet?");
                String petName = usrIn.next();   // Read user's pet name

                System.out.println("What is the age of your pet?");
                int petAge = usrIn.nextInt();    // Read user's pet age

                System.out.println("What is your lucky number?");
                int luckyNum = usrIn.nextInt();  // Read user's lucky number

                System.out.println("Do you have a favorite sport player? If so, what is their jersey number?");
                int jerseyNum = usrIn.nextInt(); // Read user's favorite sport player's jersey number

                System.out.println("What is the model year of your car?");
                int carModelYear = usrIn.nextInt();  // Read user's car model year

                System.out.println("What is the first name of your favorite actor or actress?");
                String favoriteActorOrActress = usrIn.next();  // Read user's favorite actor or actress name

                // Generate lottery numbers
                final int MAX_LOTTERY_NUMBER = 65;
                final int MAX_MAGIC_BALL = 75;

                Random random = new Random();

                int[] lotteryNumbers = new int[5];
                for (int i = 0; i < 5; i++) {
                    lotteryNumbers[i] = random.nextInt(MAX_LOTTERY_NUMBER) + 1;  // Generate random lottery numbers
                }

                int magicBall = (jerseyNum * luckyNum) % MAX_MAGIC_BALL;  // Calculate magic ball number

                // Print lottery numbers
                System.out.println("Lottery numbers: " + lotteryNumbers[0] + ", " + lotteryNumbers[1] + ", "
                        + lotteryNumbers[2] + ", " + lotteryNumbers[3] + ", " + lotteryNumbers[4]);
                System.out.println("Magic ball: " + magicBall);

                System.out.println("Want to play again? (yes, no)");
                String playAgainOption = usrIn.next();    // Read user's choice to play again or not
                if (playAgainOption.equalsIgnoreCase("no") || playAgainOption.equalsIgnoreCase("n")) {
                    playAgain = false;    // Set playAgain flag to false if user chooses not to play again
                    System.out.println("Thank you for playing!");
                }
            } else {
                playAgain = false;    // Set playAgain flag to false if user chooses not to continue the survey
                System.out.println("Thank you for participating, " + userName + "! Please come back later.");
            }
        }

        usrIn.close();   // Close the scanner
    }
}
