import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int round = 1;
        int score = 0;
        int maxRounds = 3;
        int maxAttempts = 5;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have " + maxAttempts + " attempts to guess the number.");
        System.out.println("You will play " + maxRounds + " rounds. Let's begin!");

        while (round <= maxRounds) {
            int randomNumber = (int) (Math.random() * 100) + 1;
            int numAttempts = 0;

            System.out.println("Round " + round + ": I'm thinking of a number between 1 and 100.");

            while (numAttempts < maxAttempts) {
                System.out.print("Enter your guess (attempt " + (numAttempts + 1) + "): ");
                int userGuess = scanner.nextInt();
                numAttempts++;

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the number in " + numAttempts + " attempts!");
                    score += maxAttempts - numAttempts + 1;
                    break;
                } else if (userGuess < randomNumber) {
                    System.out.println("Your guess is too low. Try again.");
                } else {
                    System.out.println("Your guess is too high. Try again.");
                }
            }

            if (numAttempts == maxAttempts) {
                System.out.println("Sorry, you did not guess the number in " + maxAttempts + " attempts.");
                System.out.println("The number was: " + randomNumber);
            }

            round++;
        }

        System.out.println("Game over! Your final score is: " + score);
    }
}
