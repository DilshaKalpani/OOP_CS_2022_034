package LW_04;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a power of 10 (e.g., 6, 9, 12, etc.): ");
        int power = input.nextInt();

        switch (power) {
            case 6: {
                System.out.println("That’s a Million!");
                break;
            }
            case 9: {
                System.out.println("That’s a Billion!");
                break;
            }
            case 12: {
                System.out.println("That’s a Trillion!");
                break;
            }
            case 15: {
                System.out.println("That’s a Quadrillion!");
                break;
            }
            case 18: {
                System.out.println("That’s a Quintillion!");
                break;
            }
            case 21: {
                System.out.println("That’s a Sextillion!");
                break;
            }
            case 30: {
                System.out.println("That’s a Nonillion!");
                break;
            }
            case 100: {
                System.out.println("That’s a Googol!");
                break;
            }
            default: {
                System.out.println("No corresponding name for that power of 10.");
            }
        }
    }
}
