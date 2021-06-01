package insideofprogramming.lambdaexpressions;

/**
 * Video: https://www.youtube.com/watch?v=q5i_O4Uj_O8&list=PLmpc3xvYSk4z2R49JqVUF622EHuoKizyA
 * Lambda expressions allow to pass a block of code to be executed in another method. Was introduced
 * in java 8
 * This used to be achieved in earlier versions of java with
 * 1. Defining an interface with a method
 * 2. Passing that interface as a method parameter
 * 3. Passing the block of code as an Anonymous class
 * <p>
 * Below are some of usage examples of a lambda.
 * Note: Remember if this appear complex, just visit the video link above for it to make sense.
 * <p>
 * // We can pass a single expression without curly braces and semicolon
 * // It could be either a method call as in below ex. or even something like "return 8"
 * // runner.run(() -> System.out.println("Wahoo used a lambda expression"));
 * <p>
 * // We can pass multiple statements within a curly brace.
 * runner.run(() -> {
 * System.out.println("First line");
 * System.out.println("Second line in a code block");
 * return 2;
 * });
 * <p>
 * // We can pass arguments to a lambda
 * // However the "int num" is optional here, we can change it be just (a) -> return a;
 * runner.run((int num) -> {
 * return 2 + num;
 * });
 * <p>
 * // Now if a lambda accepts only a single argument then the round brackets surrounding the
 * // argument are optional.
 * runner.run(num -> {
 * return 3 + num;
 * });
 * <p>
 * // Lets see an example when we would need to specify the type of parameter
 * // If we add IStringExecutable and overloaded run method then it would be ambiguous
 * // for java as to which one we are referring to with above commented expression.
 * <p>
 * runner.run((String name) -> {
 * return "Hello " + name;
 * });
 * <p>
 * // We can have multiple arguments as well in a lambda expression.
 * runner.run((first, second) -> {
 * return 2 + first + second;
 * });
 */

// Interface with single method is called as Functional Interface in Java
interface IExecutable {
    int execute(int first, int second);
}

//interface IStringExecutable {
//    String execute(String aString);
//}

class Runner {
    public void run(IExecutable exec) {
        System.out.println("Executing block of code in run...");

        // we can accept return values from executed block of code as well.
        int value = exec.execute(5, 5);
        System.out.println("Returned value is: " + value);
    }

//    public void run(IStringExecutable exec) {
//        System.out.println("Executing block of code in run...");
//        // we can accept return values from executed block of code as well.
//        String value = exec.execute("Overloaded with string");
//        System.out.println("Returned value is: " + value);
//    }
}


public class App {

    public static void main(String[] args) {

        int var = 10;

        // If we do below. Both Anonymous class and lambda will throw error
        // for usage of local variable "var"
        // var = 11;

        Runner runner = new Runner();
        // < Java 8 syntax, we are passing an object of anonymous class with
        // an overridden implementation

        runner.run(new IExecutable() {
            @Override
            public int execute(int first, int second) {
                int var = 20;
                System.out.println("Using Anonymous classes");
                return 1 + first + second + var;
            }
        });

        System.out.println("==================");

        // Can use local variables from enclosing scope as long as they are
        // "effectively final" i.e. are not re-assigned.
        runner.run((int first, int second) -> {
            // int var = 10; - Not allowed but works in Anonymous class.
            return 2 + first + second + var;
        });

        // A more explicit declaration of lambda:
        IExecutable ex = (first, second) -> {
            return 3 + first + second;
        };

        runner.run(ex);

        // Or we can write it a bit generically but would then need to cast.
        Object func = (IExecutable) (first, second) -> {
            return 99 + first + second;
        };
    }
}
