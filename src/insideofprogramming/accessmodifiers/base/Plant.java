package insideofprogramming.accessmodifiers.base;

public class Plant {

    // public: can be accessed from anywhere
    // Usually a bad practice, instance variables should be encapsulated and their use should
    // be controlled via methods
    public String type;

    // constants can be public and this is acceptable practice.
    // constants should be with all caps (can be separated by underscore
    public static final String GENES = "botanical";

    // private: can be only accessed in same class.
    // not even using object of the class.
    private String geneticSequence;

    // protected: Can be accessed in same class, subclass and same package
    protected String height;

    // No modifier: Same package only.
    int width;

    public Plant() {
        type = "indoor";
        geneticSequence = "rgncad";
        height = "not defined yet";
    }
}
