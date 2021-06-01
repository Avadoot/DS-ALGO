package insideofprogramming.innerclasses;

public class Robot {

    private String id;

    /**
     * Inner class can access NON STATIC members of Outer class.
     * Outer class method can also return object of inner class.
     * Usually we use private inner classes when we want to group functionality inside class
     * and want the inner class to have access to instance members.
     */
    private class Brain {
        public void think() {
            System.out.println("Robot " + id + " thinks...");
        }
    }

    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging");
        }
    }


    public Robot(String id) {
        this.id = id;
    }

    public void start() {
        System.out.println("Robot " + id + " is starting...");
        Brain brain = new Brain();
        brain.think();

        final String NAME = "Robert";

        /**
         * Can have class inside a method if you want to pass this
         * class to another method inside. Can access instance members
         * And can only access constants (declared with final) in Outer
         * method.
         */
        class Foo {
            public void doSomething() {
                System.out.println("Foo: " + id);
                System.out.println("Accessing Constants: " + NAME);
            }
        }

        Foo foo = new Foo();
        foo.doSomething();

    }
}
