package insideofprogramming.classes;

class Person {
    String fullName;
    int age;
}

public class Test {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.fullName = "John Boggs";
        person1.age = 29;

        Person person2 = new Person();
        person2.fullName = "Roger phillips";
        person2.age = 40;

        System.out.println(person1.fullName + " " + person1.age);
        System.out.println(person2.fullName + " " + person2.age);
    }
}

