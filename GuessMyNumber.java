import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println(" Guess My Number ");
        

        int numberToGuess = random.nextInt(10) + 1; 
        int userGuess = 0;
        

        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
        

            if (userGuess < numberToGuess) { 
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println(" guessed the number  " );
            }
        }
        scanner.close();
    }
}