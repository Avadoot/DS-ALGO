package insideofprogramming.serialization;

import java.io.Serializable;

// Class should implement Serializable interface to support that feature.
// Serializable does not have any functions to implement.
public class Person implements Serializable {

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%d : %s", id, name);
    }
}
