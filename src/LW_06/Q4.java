package LW_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();

        while (true) {
            System.out.print("Enter pet name (STOP to end): ");
            String name = sc.nextLine();

            if (name.equalsIgnoreCase("STOP")) break;

            System.out.print("Enter pet type (c for cat, d for dog): ");
            char type = sc.nextLine().charAt(0);

            if (type == 'c') {
                Cat cat = new Cat();
                cat.setName(name);
                System.out.print("Enter coat color: ");
                cat.setCoatColor(sc.nextLine());
                pets.add(cat);
            } else {
                Dog dog = new Dog();
                dog.setName(name);
                System.out.print("Enter weight: ");
                dog.setWeight(Double.parseDouble(sc.nextLine()));
                pets.add(dog);
            }
        }

        System.out.println("\nPet Details:");
        for (Pet p : pets) {
            if (p instanceof Cat) {
                Cat c = (Cat) p;
                System.out.println("Name: " + c.getName() +
                        " | Type: Cat | Coat Color: " + c.getCoatColor());
            } else {
                Dog d = (Dog) p;
                System.out.println("Name: " + d.getName() +
                        " | Type: Dog | Weight: " + d.getWeight());
            }
        }
    }
}
