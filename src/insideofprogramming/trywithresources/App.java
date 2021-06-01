package insideofprogramming.trywithresources;

// class needs to implement AutoCloseable to use try with resources
class DB implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("Closing the file");
    }
}

public class App {

    public static void main(String[] args) {
        // try with resources will automatically call the close method
        try (DB db = new DB()) {

        }
    }
}
