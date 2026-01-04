package LW_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Cat");
            System.out.println("2. Add Dog");
            System.out.println("3. Remove Cat");
            System.out.println("4. Remove Dog");
            System.out.println("0. Quit");
            System.out.print("Choice: ");

            int choice = Integer.parseInt(sc.nextLine());

            if (choice == 0) break;

            switch (choice) {
                case 1:
                    Cat cat = new Cat();
                    System.out.print("Name: ");
                    cat.setName(sc.nextLine());
                    System.out.print("Coat Color: ");
                    cat.setCoatColor(sc.nextLine());
                    pets.add(cat);
                    break;

                case 2:
                    Dog dog = new Dog();
                    System.out.print("Name: ");
                    dog.setName(sc.nextLine());
                    System.out.print("Weight: ");
                    dog.setWeight(Double.parseDouble(sc.nextLine()));
                    pets.add(dog);
                    break;

                case 3:
                    System.out.print("Enter cat name to remove: ");
                    String cname = sc.nextLine();
                    pets.removeIf(p -> p instanceof Cat && p.getName().equals(cname));
                    break;

                case 4:
                    System.out.print("Enter dog name to remove: ");
                    String dname = sc.nextLine();
                    pets.removeIf(p -> p instanceof Dog && p.getName().equals(dname));
                    break;
            }
        }

        System.out.println("Program Ended.");
    }
}
