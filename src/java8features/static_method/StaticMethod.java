package java8features.static_method;

/**
 * Interface can define static methods now
 * Classes extending Vehicle interface cannot override producer method
 */
interface Vehicle {
    static String producer() {
        return "N&F Vehicles";
    }
}

public class StaticMethod {
    // To call producer outside interface, we can call it using interface name itself
    private String producer = Vehicle.producer();

    public static void main(String[] args) {
        StaticMethod method = new StaticMethod();
        System.out.println(method.producer);
    }
}
