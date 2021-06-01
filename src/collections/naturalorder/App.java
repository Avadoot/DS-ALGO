package collections.naturalorder;

import java.util.*;

class Person implements Comparable<Person> {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Person person) {
        int len1 = name.length();
        int len2 = person.name.length();

        if (len1 > len2)
            return 1;
        else if (len1 < len2)
            return -1;
        else
            // case if two keys are of same length
            // and there is a mismatch between equals() and compareTo
            // Here only one of Joe or Sue would have been stored if below is
            // mentioned as 0;
            return name.compareTo(person.name);
    }
}

public class App {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        SortedSet<Person> set = new TreeSet<>();

        addElements(list);
        addElements(set);

        Collections.sort(list); // Array list maintains insertion order
        showElements(list);

        showElements(set); // Note: Tree set items are already sorted

    }

    private static void addElements(Collection<Person> collection) {
        collection.add(new Person("Roger"));
        collection.add(new Person("Steve"));
        collection.add(new Person("Sue"));
        collection.add(new Person("Joe"));
        collection.add(new Person("Ajay"));
    }

    private static void showElements(Collection<Person> collection) {
        System.out.println();

        for (Person person : collection) {
            System.out.println(person);
        }
    }
}
