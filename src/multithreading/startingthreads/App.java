package multithreading.startingthreads;

/**
 * Basic requirement to make a code concurrent is to extend `Thread` class and override the run()
 */
class Runner extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread job: " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class App {
    public static void main(String[] args) {
        Runner runner1 = new Runner();
        // Note: calling start() starts a new thread.
        // We could have called run() but it would then have run on the main thread of the class
        runner1.start();

        // Adding another start() method allows code to be run concurrently
        Runner runner2 = new Runner();
        runner2.start();
    }
}
