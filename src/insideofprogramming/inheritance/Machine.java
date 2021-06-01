package insideofprogramming.inheritance;

public class Machine {

    // private = Can be only accessed inside the class
    private String model = "Hyper loop";

    // protected = Can be accessed in the class and derived classes
    protected String baseModel = "Falcon X";

    public void start() {
        System.out.println("Machine started");
    }

    public void stop() {
        System.out.println("Machine stopped");
    }
}
