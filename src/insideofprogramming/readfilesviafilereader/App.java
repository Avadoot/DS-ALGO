package insideofprogramming.readfilesviafilereader;

import java.io.*;

/**
 * 1. Create File object
 * 2. Create FileReader with the file object
 * 3. Create BufferedReader with file reader object
 * 4. Use readLine() in Buffered reader to read file.
 */
public class App {

    public static void main(String[] args) {
        File file = new File("/readfilesviafilereader/testData");

        BufferedReader br = null;
        String line;

        try {
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);

            // While file has data to be read.
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found : " + file.toString());
        } catch (IOException ex) {
            System.out.println("Unable to read file : " + file.toString());
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Error in closing file : " + file.toString());
            } catch (NullPointerException e) {
                System.out.println("File was not opened successfully : " + file.toString());
            }
        }
    }
}
