import java.util.Scanner;
import java.util.Random;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        while (true) {
            int numberToGuess = rand.nextInt(100) + 1;
            int attempts = 5;
            boolean won = false;

            System.out.println("\nI have selected a number between 1 and 100. Try to guess it!");
            System.out.println("You have " + attempts + " attempts.");

            while (attempts > 0) {
                System.out.print("Enter your guess: ");
                int userGuess = input.nextInt();
                attempts--;

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number correctly.");
                    score++;
                    won = true;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                System.out.println("Attempts left: " + attempts);
            }

            if (!won) {
                System.out.println("Sorry! You've used all attempts. The correct number was: " + numberToGuess);
            }

            System.out.println("Your current score: " + score);

            System.out.print("\nDo you want to play again? (yes/no): ");
            String playAgain = input.next().toLowerCase();

            if (!playAgain.equals("yes")) {
                System.out.println("Thanks for playing! Your final score: " + score);
                break;
            }
        }
    }
}