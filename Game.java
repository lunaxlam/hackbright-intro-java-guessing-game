import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;
/** A number guessing game. */
// users name -> user input
// guess number -> user input
// keep track of how many guesses there were
// do this until user guesses correct number
// display number of guesses -> output


public class Game {
  public static void main(String[] args) {
    System.out.println("Welcome to the Guessing Game!");

    Scanner input = new Scanner(System.in);
    int amountOfGuesses = 0;
    // Get user's name
    System.out.println("Enter your name:");
    String name = input.nextLine();

    // Output 
    System.out.println(name + ", I'm thinking of a number between 0 and 100.");

    Random rand = new Random();

    int number = rand.nextInt(101);
    System.out.println(number);

    boolean guessIsCorrect = false;

    System.out.println("Enter your guess:");

    while (!guessIsCorrect) {
    
    try {
      String user_guess = input.nextLine();
      int user_guess_int = Integer.parseInt(user_guess);
      
      while (user_guess_int != number) { 
        amountOfGuesses++;

        if (user_guess_int > number) {
          System.out.println("Your guess is too high, try again.");
        } else if (user_guess_int < number) {
          System.out.println("Your guess is too low, try again.");
        }

        System.out.println("Enter your guess:");
        user_guess = input.nextLine();
        user_guess_int = Integer.parseInt(user_guess);

      }
      guessIsCorrect = true;
      System.out.println("Well done, " + name + "! You found my number in " + amountOfGuesses + " tries!");
    }
   catch (NumberFormatException e) {
      System.out.println("Not an integer. Try again. Enter your guess: ");
      
    }
  }
  }
}