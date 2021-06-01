package insideofprogramming.genericsandwildcards;


import java.util.ArrayList;

class Machine {

    @Override
    public String toString() {
        return "I am a machine";
    }

    public void start() {
        System.out.println("Machine starting...");
    }
}

class Camera extends Machine {

    @Override
    public String toString() {
        return "I am a camera";
    }

    public void snap() {
        System.out.println("Taking photo");
    }
}

public class App {

    /**
     * Prints contents of Array List of Strings
     *
     * @param players List of player names
     */
    public static void showList(ArrayList<String> players) {
        for (String player : players) {
            System.out.println(player);
        }
    }

    /**
     * Prints contents of an ArrayList of objects
     *
     * @param machines List of Machine objects
     */
    public static void showObjectList(ArrayList<Machine> machines) {
        for (Machine machine : machines) {
            System.out.println(machine);
        }
    }

    /**
     * ArrayList<?> : Here ? refers to wildcard, meaning we can pass any type
     * However it needs to be a list of objects and we cannot call methods specific
     * to Camera or Machine class in this case.
     *
     * @param objects List of objects
     */
    public static void showGenericList(ArrayList<?> objects) {

        // Object is superclass of all and has a toString method.
        // Only way to call specific methods is to do casting.
        for (Object object : objects) {
            System.out.println(object);
        }
    }

    /**
     * ArrayList<? extends Machine> reads as:
     * Array of Unknown objects which are derived from Machine
     *
     * @param objects
     */
    public static void showGenericListWithUpperBound(ArrayList<? extends Machine> objects) {
        for (Machine machine : objects) {
            System.out.println(machine);
            machine.start();
            // Cannot call snap();
        }

    }

    /**
     * Sets lower bound, basically any class above Camera
     *
     * @param objects
     */
    public static void showGenericListWithLowerBound(ArrayList<? super Camera> objects) {
        for (Object object : objects) {
            System.out.println(object);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> players = new ArrayList<>();
        players.add("Rahul Dravid");
        players.add("Sachin Tendulkar");

        showList(players);

        ArrayList<Machine> machines = new ArrayList<>();
        machines.add(new Machine());
        machines.add(new Machine());

        showObjectList(machines);

        ArrayList<Camera> cameras = new ArrayList<>();
        cameras.add(new Camera());
        cameras.add(new Camera());

        System.out.println("====================");
        showGenericList(cameras);
        showGenericList(machines);

        System.out.println("********************");
        showGenericListWithUpperBound(machines);
        showGenericListWithUpperBound(cameras);

        showGenericListWithLowerBound(cameras);


    }

}
