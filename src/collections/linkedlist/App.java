package collections.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Array list adds elements adjacent to each other
 * [0][1][2][3] ....
 * Its is easier to add elements to the end, but at beginning requires to shift each element
 * which is very expensive
 * <p>
 * <p>
 * Linked list has each element such that it holds a reference to previous and next element
 * Thus traversing is slightly more expensive but adding elements is very easy
 * <p>
 * [0] -> [1] -> [2]
 * <-     <-
 * <p>
 * Rule of Thumb:
 * If you want to add elements to end of list use ArrayList
 * If you want to add elements in beginning or middle, use LinkedList.
 */
public class App {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        timeIt("ArrayList", arrayList);
        timeIt("LinkedList", linkedList);
    }

    private static void timeIt(String type, List<Integer> aList) {

        for (int i = 0; i < 1E5; i++) {
            aList.add(i);
        }

        long start = System.currentTimeMillis();

        // Adding items at end of list
        // Array List is faster
//        for(int i=0; i < 1E5; i++) {
//            aList.add(i);
//        }

        // Add to the beginning of the list
        // Here Linked list is faster compared to Array List
        for (int i = 0; i < 1E5; i++) {
            aList.add(0, i);
        }

        long end = System.currentTimeMillis();

        System.out.printf(" Total time taken by %s = %d ms", type, end - start);
        System.out.println();
    }
}
