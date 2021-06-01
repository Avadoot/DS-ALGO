package insideofprogramming.abstractclasses;

public class App {

    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.setId("1");
        bmw.run();

        Camera nikon = new Camera();
        nikon.setId("2");
        nikon.start(); nikon.performAction(); nikon.stop();

    }
}
