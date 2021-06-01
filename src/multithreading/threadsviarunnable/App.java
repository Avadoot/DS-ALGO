package multithreading.threadsviarunnable;

// Another way to create a multi threaded function is to implement Runnable interface
// and create a Thread class object with such a class in its constructor
class Runner implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Print job: " + i);
        }
    }
}

public class App {

    public static void main(String[] args) {
        Thread first = new Thread(new Runner());
        Thread second = new Thread(new Runner());

        first.start();
        second.start();
    }
}
