package insideofprogramming.anonymousclasses;

class Machine {
    public void start() {
        System.out.println("Machine started!");
    }
}

interface Plant {
    public void grow();
}

public class App {

    public static void main(String[] args) {

        // Below is an anonymous class, which is basically a child class of Machine
        // with an overridden impl. Here, note semicolon at end of anonymous class.
        // Such classes are like a one time thing.
        Machine machine = new Machine() {

            @Override
            public void start() {
                System.out.println("Anonymous machine started!");
            }
        };

        machine.start();

        // We can assign an anonymous class to an interface and then call the appropriate
        // overridden methods.
        Plant plant = new Plant() {

            public void grow() {
                System.out.println("Plant growing");
            }
        };

        plant.grow(); // Plant growing
    }
}
