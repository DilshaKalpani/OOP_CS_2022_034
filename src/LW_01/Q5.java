package LW_01;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter Outer circle radius: ");
        double ro = sn.nextDouble();

        System.out.print("Enter Inner circle radius: ");
        double ri = sn.nextDouble();

        Circle outCircle = new Circle(ro);
        Circle inCircle = new Circle(ri);

        double outCircleArea = outCircle.computeArea();
        double inCircleArea = inCircle.computeArea();

        double shadedArea = outCircleArea - inCircleArea;

        System.out.println("Area of the shaded region = " + shadedArea);
        sn.close();
    }
}
