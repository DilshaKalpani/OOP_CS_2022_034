package LW_02;
import java.util.Scanner;

public class Q2 {

    public static int countDigits(int num) {
        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num != 0) {
            num = num / 10; // remove last digit
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer (negative number to quit): ");
            int input = scanner.nextInt();

            if (input < 0) {
                System.out.println("Program ended.");
                break;
            }

            int digits = countDigits(input);
            System.out.println(input + " has " + digits + " digits.");
        }

        scanner.close();
    }
}
