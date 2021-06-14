package java8features.default_method;

/**
 * Read from: https://www.baeldung.com/java-8-new-features
 * Default methods in an interface can be declared using default keyword
 * These can be overridden by an implementing class
 */
interface Vehicle {
    static String producer() {
        return "General motors";
    }

    default String getOverview() {
        return "Who made the vehicle: " + producer();
    }
}

class VehicleImpl implements Vehicle {
    @Override
    public String getOverview() {
        return "I can just override this!!";
    }

    /**
     * To use a default method an instance of the class should be created.
     * In below case, since we have overridden impl in extending class, we would be calling
     * getOverview() inside VehicleImpl
     */
    static void printOverview() {
        VehicleImpl vehicle = new VehicleImpl();
        System.out.println(vehicle.getOverview());
    }
}

public class DefaultMethod {
    public static void main(String[] args) {
        VehicleImpl.printOverview();
    }
}
