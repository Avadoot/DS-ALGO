package insideofprogramming.methods;

class Person {
    String fullName;
    int age;


    // Below is an example of a method which gives a behavior to the "Person" class
    // Here "void" tells that the method does not return any data
    // method names should be camelCase i.e. first letter as small and followed by rest having caps.
    void speak() {
        System.out.println("Hello, my name is " + fullName + " and i am " + age + " years old");
    }
}


public class Test {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.fullName = "John Boggs";
        person1.age = 29;
        person1.speak();

        Person person2 = new Person();
        person2.fullName = "Roger phillips";
        person2.age = 40;
        person2.speak();
    }
}

