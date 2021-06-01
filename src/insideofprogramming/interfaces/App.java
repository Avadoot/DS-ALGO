package insideofprogramming.interfaces;

public class App {

    public static void main(String[] args) {

        Machine mac1 = new Machine();
        mac1.start();
        mac1.showInfo();

        Person person1 = new Person("Rob");
        person1.greet();
        person1.showInfo();

        System.out.println("=============");
        // Interface can point to a class object which implements the interface
        // It can only call method which are provided in the interface.
        Information info = person1;
        info.showInfo();

        // Can assign a new object of machine to interface as well
        Information info1 = new Machine();
        info1.showInfo();

        // Interface type can be passed as an argument to a method as well
        showInformation(mac1);
        showInformation(person1);
    }

    private static void showInformation(Information info) {
        info.showInfo();
    }
}
