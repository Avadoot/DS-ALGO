package insideofprogramming.abstractclasses;

public class Camera extends Machine {
    @Override
    public void start() {
        System.out.println("Camera starting ...");
    }

    @Override
    public void stop() {
        System.out.println("Camera stopping ... ");
    }

    @Override
    public void performAction() {
        System.out.println("Camera performing actions ...");
    }
}
