package multithreading.threadviaanonymousclass;

public class App {
    public static void main(String[] args) {
        Thread aThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Job: " + i);
            }
        });

        aThread.start();
    }
}
