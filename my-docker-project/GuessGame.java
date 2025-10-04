import java.util.Scanner;
import java.util.Random;

public class GuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(10) + 1;
        int guess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.print("Guess a number between 1 and 10: ");

        guess = scanner.nextInt();

        if (guess == numberToGuess) {
            System.out.println("🎉 Correct! You guessed the number!");
        } else {
            System.out.println("❌ Wrong! The correct number was " + numberToGuess);
        }

        scanner.close();
    }
}
