package LW_04;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second Number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter third Number : ");
        int num3 = sc.nextInt();

        if(num1<=num2 && num1<=num3){
            System.out.println("Min is "+num1);
        }else if (num2<=num1 && num2<=num3){
            System.out.println("Min is "+num2);
        }else{
            System.out.println("Min is "+num3);
        }

    }
}
