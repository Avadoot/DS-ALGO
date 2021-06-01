package collections.customobjectsinsetsormaps;

import java.util.*;


class Person {
    private Integer id;
    private String name;

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return String.format("%d : %s", id, name);
    }


    // equals and hash code methods are required to be overridden
    // to give context on how two objects can be equal in a map or set.
    // if overridden, non unique elements would not be updated inside the map or set
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}


public class App {


    public static void main(String[] args) {

        Person sue = new Person(0, "Sue");
        Person rob = new Person(1, "Rob");
        Person sueCousin = new Person(0, "Sue");


        Map<Person, Integer> persons = new LinkedHashMap<>();
        persons.put(sue, 0);
        persons.put(rob, 1);
        persons.put(sueCousin, 2); // same as sue

        for (Person key : persons.keySet()) {
            System.out.println(key + " => " + persons.get(key));
        }

        Set<Person> onlyPersons = new LinkedHashSet<>();
        onlyPersons.add(sue);
        onlyPersons.add(rob);
        onlyPersons.add(sueCousin); // same as sue

        System.out.println(onlyPersons);

    }
}
