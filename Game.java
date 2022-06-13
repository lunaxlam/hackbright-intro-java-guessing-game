import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

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

    // Initial guess
    String user_guess;
    int user_guess_int;

    while (!guessIsCorrect) {
      System.out.println("Enter your guess:");
      amountOfGuesses++;

    try {
      // while (user_guess_int != number) { 
      user_guess = input.nextLine();
      user_guess_int = Integer.parseInt(user_guess);
    } catch (NumberFormatException e) {
      System.out.println("Not an integer. Try again.");
      continue;  
      } 
      
      if (user_guess_int > number) {
          System.out.println("Your guess is too high, try again.");
        } else if (user_guess_int < number) {
          System.out.println("Your guess is too low, try again.");
        } else {
          guessIsCorrect = true;
          System.out.println("Well done, " + name + "! You found my number in " + amountOfGuesses + " tries!");
        }
    }
  }
  }
