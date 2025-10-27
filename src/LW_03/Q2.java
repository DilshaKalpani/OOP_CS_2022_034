package LW_03;
import java.util.Scanner;


public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Temperature in Fahrenheit : ");
        double F = sc.nextDouble();
        Temperature temp = new Temperature();
        temp.setFahrenheit(F);
        System.out.println("Temperature in Celsius: " + temp.toCelsius());

    }
}
