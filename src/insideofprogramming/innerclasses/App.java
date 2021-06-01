package insideofprogramming.innerclasses;

public class App {

    public static void main(String[] args) {
        Robot robot = new Robot("T3");
        robot.start();

        // This is a common pattern.
        Robot.Battery battery = new Robot.Battery();
        battery.charge();
    }
}
