package LW_01;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter Your Word : ");
        String word = sn.next();
        int length = word.length();

        if(length % 2 == 0){
            System.out.println("The word must have an odd length.");

        }else{
            int middleIndex = length/2;
            char middleChar = word.charAt(middleIndex);
            System.out.println("The Middle Character is : "+ middleChar);
        }
        sn.close();
    }
}
