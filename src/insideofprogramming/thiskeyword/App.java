package insideofprogramming.thiskeyword;

class Frog {
    // To encapsulate and allow access only with getters and setters
    // we can set the instance members as private

    private String name;
    private int age;

    // Getter
    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int age) {
        // this keyword ensures we refer to the instance var
        // this can be conveniently used when we have a local var in the scope with same name
        // but is really not necessary everywhere to use.
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}


public class App {

    public static void main(String[] args) {
        Frog frog1 = new Frog();
        frog1.setName("Bertie");
        frog1.setAge(25);

        System.out.println(frog1.getName());
        System.out.println(frog1.getAge());
    }
}
