package insideofprogramming.multipleexceptions;

import java.io.IOException;

public class App {

    public static void main(String[] args) {

        // Multi catch - Java 7 onwards
        // Exceptions should be disjoint i.e. should not have multiple sub classes of
        // exceptions where a parent class is already present
        // e.g. FileNotFoundException and IOException cannot be together as IOException
        // is parent class of FileNotFoundException.
        try {
            Test.testSomething();
        } catch (IOException | IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }


        // Alternate style of catching multiple exceptions.
        // Ensure lower sub class of exceptions is always caught first
        // Since a base class exception would result in sub class never getting caught.
        try {
            Test.testSomething();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }
}
