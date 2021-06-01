package insideofprogramming.stringbuilderandformatting;

public class App {

    public static void main(String[] args) {

        // memory inefficient way of adding to a string
        // In java, strings are immutable, hence every change creates a new string
        // and is assigned back to var, which is very memory inefficient

        String greeting = "";
        greeting += " My name is Susan,";
        greeting += " ";
        greeting += "and i am a Java coder";

        System.out.println(greeting);

        // efficient way is to use a StringBuilder, since it does not create a new string everytime

        StringBuilder sb = new StringBuilder(" ");
        sb.append(" My name is Prince,");
        sb.append(" ");
        sb.append(" and i am actually a prince");

        System.out.println(sb.toString());

        // append() method always returns a reference to String builder object
        // and hence they can be chained in a fluent way.
        // Also StringBuffer is a Thread safe way of achieving the same as String builder.

        // Lets look into formatting a bit

        // String formatting
        String target = "\t This is a tab \n and this is a newline";
        System.out.println(target);

        // Integer formatting
        System.out.printf("No of students: %d\n", 10);
        System.out.printf("No of teachers: %5d\n", 29); // specify no of chars before the formatting
        System.out.printf("No of male students: %-3d", 7); // left align

        for (int i = 0; i < 20; i++) {
            // This would always ensure 2 chars for digit, leading it to be aligned well
            System.out.printf("%2d: %s\n", i, "Some text here");
        }

        System.out.printf("%.3f", 3.4235); // here . can specify how much precision of float we want.
    }
}
