package LW_04;

import java.util.Scanner;

public class Q7 {

    public static int countDigits(int number) {
        int count = 0;
        if (number == 0)
            return 1;

        while (number != 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer (negative number to stop): ");
            int num = input.nextInt();

            if (num < 0) {
                System.out.println("Program ended.");
                break;
            }

            int digits = countDigits(num);
            System.out.println("Number of digits: " + digits);
        }
    }
}
