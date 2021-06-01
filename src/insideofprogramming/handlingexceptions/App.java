package insideofprogramming.handlingexceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


/**
 * All Exceptions have base class as Exception.
 */
public class App {

    public static void main(String[] args) {

        String path = "nonExistentFile";

        // Way 2:
        // Example of a try catch block.
        try {
            openFile(path);
        } catch (FileNotFoundException e) {
            System.out.println("Could not find file: " + path);
        }
    }

    // Way 1: Keep throwing exception using "throws" keyword
    // and either push it out till main or handle it with try catch block
    public static void openFile(String path) throws FileNotFoundException {
        File file = new File(path);
        FileReader fr = new FileReader(file);
    }
}
