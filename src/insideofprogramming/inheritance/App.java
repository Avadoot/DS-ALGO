package insideofprogramming.inheritance;

public class App {
    public static void main(String[] args) {
        Machine mach1 = new Machine();
        mach1.start();
        mach1.stop();

        Car tesla = new Car();
        tesla.start();
        tesla.stop();

        tesla.showAdditionalInfo();
    }
}
