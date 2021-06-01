package insideofprogramming.polymorphism;

public class App {

    public static void main(String[] args) {
        Plant plant1 = new Plant();
        Tree tree1 = new Tree();

        plant1.grow();
        tree1.grow();

        // Polymorphism guarantees wherever a parent class type is expected
        // we can always pass child class reference.

        // Parent class can point to child classes object
        // Below will call the child classes method.
        Plant plant2 = tree1;
        // However the type of variable determines what methods can be called.
        // i.e. shedLeaves() is not accessible for plant 2.
        plant2.grow();

        // Will call Tree's grow method.
        doGrow(tree1);

    }

    public static void doGrow(Plant aPlant) {
        aPlant.grow();
    }
}
