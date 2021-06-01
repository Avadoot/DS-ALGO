package collections.iterators;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class IteratorExample {
    public static void showNormalForEachLoop(Collection<String> collection) {
        // Java 5 onwards
        // In background it implements an iterator itself.
        for (String item : collection)
            System.out.println(item);
    }

    public static void showIteratorExample(Collection<String> collection) {
        Iterator<String> it = collection.iterator();

        while (it.hasNext()) {
            String item = it.next();
            System.out.println(item);

            // Using iterators we can remove items while iterating
            // this is not possible with foreach loop in java.
            // Since you cannot modify an item while iterating with foreach loop
            if (item.equals("dog"))
                it.remove();
        }
        System.out.println();
    }


}

public class App {
    public static void main(String[] args) {
        List<String> animals = new LinkedList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("snake");

        IteratorExample.showIteratorExample(animals);
        IteratorExample.showNormalForEachLoop(animals);
    }
}
