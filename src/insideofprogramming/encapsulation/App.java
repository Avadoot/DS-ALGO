package insideofprogramming.encapsulation;

class Plant {

    // Only public members should be constant
    public static final String SPECIES = "Plant species";

    // data should never be exposed to other classes.
    // this reduces coupling between classes and makes debugging easier.
    private String name;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

}

public class App {

    public static void main(String[] args) {
        Plant aPlant = new Plant();
        aPlant.setName("Freddy");
        System.out.println(aPlant.getName());
    }
}
