package LW_01;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter centimetre Value :");
        double centi = sn.nextDouble();

        double totalInches = centi/2.54;
        int feet = (int) (totalInches/12);
        double inches = totalInches %12;

        System.out.println(centi + " cm = " + feet + " feet " + String.format("%.2f", inches) + " inches");
        sn.close();

    }
}
