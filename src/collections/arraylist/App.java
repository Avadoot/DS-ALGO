package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        // Items in list can have only object types in generics
        // here we cannot specify int, float (primitive) type as the type.

        // Adding values in list
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(6);
        numbers.add(9);

        // Getting values from list
        System.out.println(numbers.get(1));

        // Iterate in a list and get values (Indexed loop)
        System.out.println("\n Indexed Loop");
        for (Integer idx = 0; idx < numbers.size(); idx++) {
            System.out.println(numbers.get(idx));
        }

        // Remove items from a list
        numbers.remove(numbers.size() - 1);

        // For each loop to iterate in a list
        System.out.println("\n Foreach loop");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // All lists implement List interface
        // Here List<String> is an interface pointing to object of a derived class.
        List<String> names = new ArrayList<>();
        names.add("Dummy");

        System.out.println(names.get(0));

    }
}
