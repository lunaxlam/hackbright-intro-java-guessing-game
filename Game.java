import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class Game {
  public static void main(String[] args) {

    Random rand = new Random();
    int number = rand.nextInt(101);

    int amountOfGuesses = 0;

    System.out.println("Welcome to the Guessing Game!");

    Scanner input = new Scanner(System.in);

    System.out.println("Enter your name:");
    String name = input.nextLine();

    System.out.println(name + ", I'm thinking of a number between 0 and 100.");

    boolean guessIsCorrect = false;

    String user_guess;
    int user_guess_int;

    while (!guessIsCorrect) {
      System.out.println("Enter your guess:");
      amountOfGuesses++;

    try {

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
