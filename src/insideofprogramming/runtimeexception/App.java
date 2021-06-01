package insideofprogramming.runtimeexception;

public class App {

    /**
     * Types of exceptions:
     * Checked: Compile time, needs to be handled with try catch or throws declaration
     * Unchecked; Run time, serious issues which cause execution to stop and should be handled.
     *
     * @param args
     */
    public static void main(String[] args) {
        int num = 5;
//        int result = 5 / 0; // ArithmeticException

        // another example:
        String text = null;
//        System.out.println(text.length()); // NullPointerException

        String[] names = {"Dylan", "Rob"};

        // Here we are explicitly capturing a Runtime exception.
        // though this is generally optional.

        try {
            System.out.println(names[2]); // ArrayIndexOutOfBoundsException
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
