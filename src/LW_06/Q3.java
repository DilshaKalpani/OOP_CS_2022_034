package LW_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();

        while (true) {
            System.out.print("Enter pet name (STOP to end): ");
            String name = sc.nextLine();

            if (name.equalsIgnoreCase("STOP")) break;

            System.out.print("Enter pet type (c for cat, d for dog): ");
            char type = sc.nextLine().charAt(0);

            Pet pet = (type == 'c') ? new Cat() : new Dog();
            pet.setName(name);
            pets.add(pet);
        }

        System.out.println("\nCats:");
        for (Pet p : pets) {
            if (p instanceof Cat) {
                System.out.println(p.getName());
            }
        }

        System.out.println("\nDogs:");
        for (Pet p : pets) {
            if (p instanceof Dog) {
                System.out.println(p.getName());
            }
        }
    }
}
