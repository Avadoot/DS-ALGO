package insideofprogramming.constructors;


class Machine {

    public String name;
    public int code;
    /*
    Constructor is a special method which is called every time a class is initialized

    Rules:
    1. Constructor must have same name as class
    2. Constructor DOES NOT have a return type
    3. Constructors can be overloaded by having different parameters
    4. A constructor can call another constructor by using `this(<T parameters1, T parameters2>)`, in such a case
    it should be the first call in the constructor
    5. Usually constructors are used to initialize certain members of the class
     */

    public Machine() {
        // below is the syntax to call another constructor within a constructor
        this("David", 89);
        System.out.println("Default constructor");
        this.name = "Jarvis";
    }

    public Machine(String name) {
        System.out.println("2nd constructor");
        this.name = name;
    }

    public Machine(String name, int code) {
        System.out.println("3rd constructor");
        this.name = name;
        this.code = code;
    }

}

public class App {

    public static void main(String[] args) {
        // new Machine(); code actually invokes the constructor
        Machine mac1 = new Machine();
        System.out.println(mac1.name);
        System.out.println(mac1.code);

//        Machine mac2 = new Machine("Arnold");
//        System.out.println(mac2.name);
//
//        Machine mac3 = new Machine("Cynthia", 999);
//        System.out.println(mac3.name + " " + mac3.code);

    }
}
