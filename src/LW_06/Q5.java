package LW_06;

import java.util.ArrayList;

public class Q5 {
    public static void main(String[] args) {

        ArrayList<Pet> pets = new ArrayList<>();

        Dog d1 = new Dog(); d1.setWeight(10);
        Dog d2 = new Dog(); d2.setWeight(5);
        Dog d3 = new Dog(); d3.setWeight(15);

        pets.add(d1);
        pets.add(d2);
        pets.add(d3);

        ArrayList<Dog> dogs = new ArrayList<>();

        for (Pet p : pets) {
            if (p instanceof Dog) {
                dogs.add((Dog) p);
            }
        }

        double sum = 0;
        double min = dogs.get(0).getWeight();
        double max = dogs.get(0).getWeight();

        for (Dog d : dogs) {
            double w = d.getWeight();
            sum += w;
            if (w < min) min = w;
            if (w > max) max = w;
        }

        System.out.println("Average Weight: " + (sum / dogs.size()));
        System.out.println("Minimum Weight: " + min);
        System.out.println("Maximum Weight: " + max);
    }
}
