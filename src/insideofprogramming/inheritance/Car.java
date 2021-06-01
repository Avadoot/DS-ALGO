package insideofprogramming.inheritance;

/*
extends tells that Car is inheriting from Machine and has access to all
methods and members which are either public or protected.
 */

public class Car extends Machine {

    // Override the default start behavior in child class
    @Override
    public void start() {
        System.out.println("Car started");
    }

    public void showAdditionalInfo() {
        System.out.println(baseModel); // works because baseModel is protected.
        // System.out.println(model); - THIS WONT WORK! Since model is private
    }
}
