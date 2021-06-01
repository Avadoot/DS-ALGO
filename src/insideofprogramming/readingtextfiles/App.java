package insideofprogramming.readingtextfiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws FileNotFoundException {

        // This path can be either absolute or relative to project root dir
        // since that is the working path.
        File dataFile = new File("/readingtextfiles/data");

        Scanner in = new Scanner(dataFile);

        int num = in.nextInt(); // only reads integer and not CRLF (Windows)
        System.out.println(num);

        in.nextLine(); // Manually read next line and discard for proper numbering.

        int count = 2;
        while (in.hasNextLine()) {
            String line = in.nextLine();
            System.out.println(count + " : " + line);
            count++;
        }

        in.close();
    }
}
