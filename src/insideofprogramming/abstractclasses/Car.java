package insideofprogramming.abstractclasses;

public class Car extends Machine {
    @Override
    public void start() {
        System.out.println("Car starting ...");
    }

    @Override
    public void stop() {
        System.out.println("Car stopping ...");
    }

    @Override
    public void performAction() {
        System.out.println("Car performing actions ...");
    }
}
