package insideofprogramming.trywithresources;

import java.io.*;

public class App2 {


    public static void main(String[] args) {
        File file = new File("/trywithresources/testData");

        // We can use try with resources to much simplify the previous code
        // with buffered readers and multiple catch clauses along with close

        // Here below line would automatically close the file handle as well.
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Could not find file " + file.toString());
        } catch (IOException e) {
            System.out.println("Could not read file " + file.toString());
        }
    }
}
