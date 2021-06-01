package collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

    public static void main(String[] args) {

        // A set can only have unique items
        // HashSet does not retain any order
        Set<String> aSet = new HashSet<>();

        // LinkedHashSet remembers order in which elements are added,
        // has a doubly linked list keeping track of elements.
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // TreeSet orders elements in natural order
        Set<Integer> treeSet = new TreeSet<>();

        aSet.add("dog");
        aSet.add("cat");
        aSet.add("tiger");
        aSet.add("dog"); // duplicate, would not insert duplicate


        linkedHashSet.add("dog");
        linkedHashSet.add("cat");
        linkedHashSet.add("tiger");

        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(9);

        System.out.println(aSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);

        // Iteration in a set

        for (String animal : aSet) {
            System.out.println(animal);
        }

        // Check if item is present in set

        System.out.println(aSet.contains("cat"));

        // Check if set is empty

        System.out.println(aSet.isEmpty());

        // Intersection of two sets
        Set<String> intersection = new HashSet<>(aSet); // new set which is copy of aSet

        Set<String> aSet2 = new HashSet<>();
        aSet2.add("dog");
        aSet2.add("cat");

        intersection.retainAll(aSet2); // Keep only elements which are unique to set 1.
        System.out.println(intersection);

        // Difference of two sets

        Set<String> difference = new HashSet<>(aSet); // Copy aSet into difference
        difference.removeAll(aSet2); // Remove all elements which are there in aSet2 from difference
        System.out.println(difference);

    }
}
