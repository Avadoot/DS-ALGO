package insideofprogramming.equals;

import java.util.Objects;

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        setId(id);
        setName(name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("%d : %s", id, name);
    }

    /**
     * Need to override equals() to tell Person class how to compare
     * if two Objects of Person are equal.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class App {

    public static void main(String[] args) {

        Person person1 = new Person(5, "Bob");
        Person person2 = new Person(5, "Bob");
        System.out.println(person1.equals(person2));

        Integer number1 = 10;
        Integer number2 = 10;
        System.out.println(number1 == number2); // true

        Double digit1 = 10.24;
        Double digit2 = 10.24;
        System.out.println(digit1 == digit2); // false

        String greeting1 = "Hello";
        String greeting2 = "Hello";
        System.out.println(greeting1 == greeting2); // true

        String greeting3 = "Hello";
        String greeting4 = "Hello World!".substring(0, 5);
        System.out.println(greeting3 == greeting4); // false

        // Hence take away here is == just checks if two objects are pointing to same
        // memory address

        // To do comparison in Java, its always safe to use .equals() :D
    }
}
