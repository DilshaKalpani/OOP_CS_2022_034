package LW_04;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double entreePrice = 0, sidePrice = 0, drinkPrice = 0;

        // --- Entree Menu ---
        System.out.println("=== Entree Menu ===");
        System.out.println("1. Tofu Burger - $3.49");
        System.out.println("2. Cajun Chicken - $4.59");
        System.out.println("3. Buffalo Wings - $3.99");
        System.out.println("4. Rainbow Fillet - $2.99");
        System.out.print("Select your entree (1-4): ");
        int entreeChoice = input.nextInt();

        switch (entreeChoice) {
            case 1:
                entreePrice = 3.49;
                break;
            case 2:
                entreePrice = 4.59;
                break;
            case 3:
                entreePrice = 3.99;
                break;
            case 4:
                entreePrice = 2.99;
                break;
            default:
                System.out.println("Invalid entree selection.");
        }

        // --- Side Dish Menu ---
        System.out.println("\n=== Side Dish Menu ===");
        System.out.println("1. Rice Cracker - $0.79");
        System.out.println("2. No-Salt Fries - $0.69");
        System.out.println("3. Zucchini - $1.09");
        System.out.println("4. Brown Rice - $0.59");
        System.out.print("Select your side dish (1-4): ");
        int sideChoice = input.nextInt();

        switch (sideChoice) {
            case 1:
                sidePrice = 0.79;
                break;
            case 2:
                sidePrice = 0.69;
                break;
            case 3:
                sidePrice = 1.09;
                break;
            case 4:
                sidePrice = 0.59;
                break;
            default:
                System.out.println("Invalid side dish selection.");
        }

        // --- Drink Menu ---
        System.out.println("\n=== Drink Menu ===");
        System.out.println("1. Cafe Mocha - $1.99");
        System.out.println("2. Cafe Latte - $1.90");
        System.out.println("3. Espresso - $2.49");
        System.out.println("4. Oolong Tea - $0.99");
        System.out.print("Select your drink (1-4): ");
        int drinkChoice = input.nextInt();

        switch (drinkChoice) {
            case 1:
                drinkPrice = 1.99;
                break;
            case 2:
                drinkPrice = 1.90;
                break;
            case 3:
                drinkPrice = 2.49;
                break;
            case 4:
                drinkPrice = 0.99;
                break;
            default:
                System.out.println("Invalid drink selection.");
        }

        // --- Total Price ---
        double total = entreePrice + sidePrice + drinkPrice;
        System.out.printf("%nYour total meal price is: $%.2f%n", total);
    }
}
