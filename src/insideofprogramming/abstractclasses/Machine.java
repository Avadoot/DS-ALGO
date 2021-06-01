package insideofprogramming.abstractclasses;

/**
 * Abstract classes:
 * 1. Can be only derived from once
 * 2. Can have concrete methods
 * 3. Abstract methods must be implemented in child class
 * 4. Abstract methods cannot be static
 * 5. Abstract class cannot be instantiated
 * 6. Should be used when child class is really that type
 * <p>
 * <p>
 * Where as
 * <p>
 * Interface:
 * 1. Can be something generic which multiple different classes can use
 * 2. Cannot have concrete implementation.
 */
public abstract class Machine {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Below are abstract methods and are required to be implemented in the
    // child classes

    public abstract void start();

    public abstract void stop();

    public abstract void performAction();

    // Can have concrete methods as well.
    public void run() {
        start();
        performAction();
        stop();
    }
}
