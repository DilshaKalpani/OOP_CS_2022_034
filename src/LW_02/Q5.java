package LW_02;

import java.util.StringTokenizer;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        StringTokenizer st = new StringTokenizer(sentence, " ,.!?;:-\"'");

        StringBuilder cleaned = new StringBuilder();

        while (st.hasMoreTokens()) {
            String word = st.nextToken().toLowerCase();

            cleaned.append(word);
        }

        String cleanStr = cleaned.toString();

        String reversed = new StringBuilder(cleanStr).reverse().toString();

        if (cleanStr.equals(reversed)) {
            System.out.println("The sentence IS a palindrome.");
        } else {
            System.out.println("The sentence is NOT a palindrome.");
        }

        sc.close();
    }
}
