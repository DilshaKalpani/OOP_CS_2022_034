package LW_02;

public class Q1 {
        public static void main(String[] args) {
            // Loop from 10 to 49
            for (int i = 10; i <= 49; i++) {
                System.out.print(i + " ");

                // After every 10 numbers, move to the next line
                if (i % 10 == 9) {
                    System.out.println();
                }
            }
        }



}
