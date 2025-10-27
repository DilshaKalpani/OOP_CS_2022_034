package LW_04;

import java.util.Scanner;
import java.util.Random;

public class Q11 {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int userGuess = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Try to guess it!");

        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < numberToGuess) {
                System.out.println("Higher! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Lower! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + numberToGuess);
            }
        }

        scanner.close();
    }
}
