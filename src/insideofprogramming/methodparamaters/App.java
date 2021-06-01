package insideofprogramming.methodparamaters;

class Robot {
    public void speak(String greeting) {
        System.out.println(greeting);
    }

    // methods can have multiple parameters (direction, distance)
    // Note here String is a reference type, i.e. its a label to something that gets passed around
    // but double is a primitive which means its like a bucket with some value and the value gets
    // passed around.
    public void move(String direction, double distance) {
        System.out.println("Okay, Moving in direction " + direction + " for " + distance + " meters");
    }
}


public class App {
    public static void main(String[] args) {
        Robot jarvis = new Robot();

        String customGreeting = "Hello World, I am jarvis";
        jarvis.speak(customGreeting);

        // method call
        jarvis.move("North", 5.98);
    }
}
