import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        int randomNumber = (int) (Math.random() * 100) + 1;

        // Take input from the user
        Scanner sc = new Scanner(System.in);
        int guess;
        boolean guessed = false;

        // Loop until the user guesses the correct number
        while (!guessed) {
            System.out.println("Guess a number between 1 and 100:");
            guess = sc.nextInt();

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number.");
                guessed = true;
            } else if (guess < randomNumber) {
                System.out.println("Too low. Guess again.");
            } else {
                System.out.println("Too high. Guess again.");
            }
        }
    }
}
