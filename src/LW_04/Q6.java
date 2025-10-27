package LW_04;

public class Q6 {
    public static void main(String[] args) {

        for (int i = 10; i <= 49; i++) {
            System.out.print(i + " ");

            // After every 10 numbers, move to a new line
            if (i % 10 == 9) {
                System.out.println();
            }
        }
    }
}
