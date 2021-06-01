package insideofprogramming.settersgetters;

class Person {

    String name;
    int age;

    // method which returns a value of type int
    int getYearsLeftToRetirement() {
        return 60 - age;
    }

    // Note: Below is useful when data is encapsulated inside class by using access modifiers
    // like private and protected

    // Getter method for age
    int getAge() {
        return age;
    }

    // Getter method for name
    String getName() {
        return name;
    }

}


public class Test {

    public static void main(String[] args) {
        Person john = new Person();
        john.name = "John";
        john.age = 40;

        System.out.println(john.getYearsLeftToRetirement());
        String greeting = "My name is " + john.getName() + " and my age is " + john.getAge();
        System.out.println(greeting);

    }

}
