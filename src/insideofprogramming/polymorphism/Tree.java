package insideofprogramming.polymorphism;

public class Tree extends Plant {

    /**
     * Subclass is overriding parent classes methods behavior
     */
    @Override
    public void grow() {
        System.out.println("Tree growing");
    }

    public void shedLeaves() {
        System.out.println("Shedding leaves");
    }
}
