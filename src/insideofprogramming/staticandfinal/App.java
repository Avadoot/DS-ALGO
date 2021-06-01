package insideofprogramming.staticandfinal;

/*
Theory:

1. Static members belong to the class and every object shares the same copy
2. Static members cannot access instance members in java, since they are initialized
before any object is created, however instance methods can access static members
3. Static members can be directly accessed using the class name e.g. Thing.description
4. Static methods

Common use cases:

1. Used to initialize constants e.g. Math.PI is a constant that can be accessed directly
2. Can be used to keep count of no of objects created for the class.
3. We can give an id to each object that is created.

 */

class Thing {
    public final static int LUCKY_NUMBER = 7;
    public String name;
    public static String description;
    public static int objCount = 0;
    public int id;

    /**
     * Constructor to maintain count of how many objects
     * are created using static members
     */
    public Thing() {
        id = objCount; // Give the current object count as id
        objCount++;
    }

    public static void setDescription() {
        description = "Static Description";
        // System.out.println(name); - THIS IS NOT ALLOWED!
        // Cannot access non static fields from static context
    }

    public String showName() {
        // Illustrates that instance methods can access static members
        return "ID: " + objCount + " |" + description + " " + name;
    }
}


public class App {

    public static void main(String[] args) {
        Thing.setDescription();

        System.out.println("Count of objects created before: " + Thing.objCount);
        Thing thing1 = new Thing();
        thing1.name = "Bob";
        System.out.println(thing1.showName());

        Thing thing2 = new Thing();
        thing2.name = "David";
        System.out.println(thing2.showName());

        System.out.println("Count of objects created after: " + Thing.objCount);
        System.out.println("Constant value " + Thing.LUCKY_NUMBER);
    }
}
