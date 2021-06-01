package insideofprogramming.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class WriteToFile {

    private static final String PATH = "/serialization/people.dat";

    public static void write(List<Person> persons) {

        // try with resources | Java 7 onwards, this would automatically call
        // close() on the FileOutputStream
        try (FileOutputStream fs = new FileOutputStream(PATH)) {
            ObjectOutputStream os = new ObjectOutputStream(fs);

            for (Person person : persons) {
                os.writeObject(person);
            }

            //  Writing again.
//            os.writeInt(persons.size());
//
//            for (Person person : persons) {
//                os.writeObject(person);
//            }

            os.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found @ path: " + PATH);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Unable to write file to " + PATH);
            e.printStackTrace();
        }
    }

    public static void writeMultiple(ArrayList<Person> persons) {
        try (FileOutputStream fs = new FileOutputStream(PATH)) {
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(persons);
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
