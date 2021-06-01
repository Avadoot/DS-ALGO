package insideofprogramming.tostringandobjectclass;

/*
Theory:
1. In java all classes are secretly inherited from Object class
2. This has default impl for some methods like equals(), toString() or hashCode();
 */

class Frog {

    private String name;
    private int age;

    public Frog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding the default toString() impl from object class
    public String toString() {

        // Another way of returning a formatted string
        return String.format("%-2s : %2d", name, age);

        /* One way of concatting strings
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" : ").append(age);
        return sb.toString();
        */
    }

}


public class App {
    public static void main(String[] args) {
        Frog frog = new Frog("Freddy", 25);

        System.out.println(frog);
        // If Frog has no impl, then calling sout calls the toString method
        // which actually outputs <className>@<hashCode>
        // caveofprogramming._21_tostringandobjectclass.Frog@60e53b93
    }
}
