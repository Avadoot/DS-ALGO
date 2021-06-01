package insideofprogramming.multipleexceptions;

import java.io.IOException;

public class Test {

    // We can specify multiple exceptions in throws as a comma separated
    // list of exceptions.
    public static void testSomething() throws IOException, IndexOutOfBoundsException {

        // Assume this function can throw below:
        // throw new IOException("Can't read file (Dummy Message)");

        // and also below exception.
        throw new IndexOutOfBoundsException("Did not find file at specified location");
    }
}
