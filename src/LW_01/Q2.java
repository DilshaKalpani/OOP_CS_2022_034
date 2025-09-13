package LW_01;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter Your First Name : ");
        String fName= sn.next();

        System.out.println("Enter Your Middle Name : ");
        String mName= sn.next();

        System.out.println("Enter Your Last Name : ");
        String lName= sn.next();

        char ch = mName.charAt(0);

        System.out.println(lName +"," +" "+ fName + " "+ch + ".");

        sn.close();
    }

}
