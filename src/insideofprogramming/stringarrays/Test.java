package insideofprogramming.stringarrays;

public class Test {

    public static void main(String[] args) {
        // Declaration and assignment of String array is similar to integer
        // Here words is pointing to an array of references, where each element is
        // again a reference to a String
        String[] words = new String[3];
        words[0] = "Words";
        words[1] = "Are";
        words[2] = "All i have";

        // Example of a foreach loop
        for (String word : words) {
            System.out.println(word);
        }

        // Another way of creating an array with assignment at the same time
        String[] fruits = {"Apple", "Banana", "Cucumber"};

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
