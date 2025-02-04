import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1; 
        int attempts = 0; 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
        
        int guess = 0; 

        
        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt(); 
            attempts++; 
        
            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
                System.out.println("It took you " + attempts + " attempts.");
            }
        }
        
        scanner.close();
    }
}
