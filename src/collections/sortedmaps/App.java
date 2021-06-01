package collections.sortedmaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

    public static void main(String[] args) {

        // Uses hash table
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Uses a linked list to connect entries in hash map
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // Uses a binary balanced tree
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // unsorted
        showMap(hashMap);

        // preserves order
        System.out.println("=====");
        showMap(linkedHashMap);

        // sorted in natural order e.g. 1,2,3,4 ... or a,b,c,d,e ...
        System.out.println("=====");
        showMap(treeMap);
    }

    private static void showMap(Map<Integer, String> aMap) {

        aMap.put(5, "cat");
        aMap.put(10, "dog");
        aMap.put(3, "fox");
        aMap.put(18, "tiger");
        aMap.put(2, "liger");
        aMap.put(20, "elephant");
        aMap.put(19, "donkey");
        aMap.put(11, "giraffe");


        // map.keySet() returns the set collection which could be iterated over.
        for (Integer key : aMap.keySet()) {
            System.out.printf("%d : %s", key, aMap.get(key));
            System.out.println();
        }
    }
}
