package insideofprogramming.serialization;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Robert");
        Person person2 = new Person(2, "Dylan");

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);

        Person[] personsArr = {new Person(3, "Gaurav"), new Person(4, "John")};
        ArrayList<Person> peopleList = new ArrayList<>(Arrays.asList(personsArr));

//        WriteToFile.write(persons);
//        ReadFromFile.read();

        WriteToFile.writeMultiple(persons);
        ReadFromFile.readMultiple();

        WriteToFile.writeMultiple(peopleList);
        ReadFromFile.readMultiple();


    }
}
