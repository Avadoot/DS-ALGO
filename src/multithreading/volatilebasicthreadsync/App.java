package multithreading.volatilebasicthreadsync;

class Runner extends Thread {
    private boolean shouldKeepRunning = true;

    public void run() {
        while (shouldKeepRunning) {
            System.out.println("I am a basic thread. Going about my business");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutDownThreadExec() {

    }
}

public class App {
}
