package collections.hashmap;

import java.util.HashMap;

/**
 * Hash map is a collection with key and value pair
 * It is unsorted
 * Adding same key overrides previous key value
 * get() on a key which does not exist should return null.
 */
public class App {

    public static void main(String[] args) {
        HashMap<String, Integer> callNumbers = new HashMap<>();

        callNumbers.put("one", 1);
        callNumbers.put("two", 2);
        callNumbers.put("three", 4); // Oops
        callNumbers.put("three", 3); // Adding same key overrides previous value.

        System.out.println(callNumbers.get("one"));
        System.out.println(callNumbers.get("ten"));

        // Iterate and get key and value from a hash map
        for (HashMap.Entry<String, Integer> entry : callNumbers.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
