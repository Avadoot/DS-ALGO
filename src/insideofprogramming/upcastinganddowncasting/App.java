package insideofprogramming.upcastinganddowncasting;

class Machine {
    public void start() {
        System.out.println("Machine Started");
    }
}

class Camera extends Machine {

    @Override
    public void start() {
        System.out.println("Camera Started");
    }

    public void snap() {
        System.out.println("Photo captured.");
    }
}

public class App {

    public static void main(String[] args) {

        Machine machine = new Machine();
        Camera camera = new Camera();

        machine.start();
        camera.start();

        // Up casting from derived to parent class.
        Machine machine1 = camera;
        machine1.start();

        // Way to work around the down casting restriction
        Machine machine2 = new Camera();
        Camera camera1 = (Camera) machine2;
        camera1.start();
        camera1.snap();

        // Down casting is inherently unsafe
        Machine machine3 = new Machine();
        Camera camera2 = (Camera) machine3; // Illegal and would throw ClassCastException.
        // Machine cannot be cast to Camera
    }
}
