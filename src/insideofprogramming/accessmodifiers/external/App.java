package insideofprogramming.accessmodifiers.external;

import insideofprogramming.accessmodifiers.base.Oak;
import insideofprogramming.accessmodifiers.base.Plant;

public class App {

    public static void main(String[] args) {
        Plant plant = new Plant();

        // Allowed, since type is public
        System.out.println(plant.type);

        // Acceptable way to get constant values (usually static)
        System.out.println(Plant.GENES);

        // Not allowed, geneticSequence is private
        // System.out.println(plant.geneticSequence);

        // Not allowed, height is protected. App is outside base package.
        // System.out.println(plant.height);

        Oak oak = new Oak();
        System.out.println(oak.type);

        // Not allowed, width has no modifier and can be accessed within same package.
        // System.out.println(oak.width);
    }

}
