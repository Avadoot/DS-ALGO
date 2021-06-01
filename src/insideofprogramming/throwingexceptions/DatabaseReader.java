package insideofprogramming.throwingexceptions;

import java.io.IOException;

public class DatabaseReader {

    public void readFromDB() throws IOException {

        // Assume some logic above returns value of returnCode
        // non zero return code are failure
        int returnCode = -1;

        if (returnCode != 0) {
            throw new IOException("Could not connect to server");
        }
    }
}
