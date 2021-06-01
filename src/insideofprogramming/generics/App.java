package insideofprogramming.generics;

import java.util.ArrayList;

class Person {

}

public class App {

    public static void main(String[] args) {


        // Old style - Before Java 5 where generics were introduced.

        ArrayList names = new ArrayList();

        names.add("Rob");
        names.add("Dylan");

        String name = (String) names.get(1);
        System.out.println(name);

        // Since java 7, explicit type in assignment is optional
        // Thus new ArrayList<>() is valid.
        // Older versions required new ArrayList<String>() to be specified explicitly.
        ArrayList<String> animals = new ArrayList<>();

        animals.add("Dog");
        animals.add("Cat");

        // Since we have used generics we don't need to cast the output
        // from get into required type.
        System.out.println(animals.get(1));

        // We can have an array list of our own objects as well.
        ArrayList<Person> persons = new ArrayList<>();
    }
}
