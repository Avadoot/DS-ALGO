package collections.complexdatastructures;

import java.util.*;

public class App {

    public static void main(String[] args) {

        // Simple DS which needs to be converted into an apt complex structure
        String[] vehicles = {"ambulance", "helicopter", "lifeboat"};

        String[][] drivers = {
                {"Rob", "Sue", "Mary"},
                {"Bob", "Ethan", "Ironman", "Spiderman"},
                {"Aquaman", "Superman", "Wonder women"}
        };

        // Adding elements to the collection
        Map<String, Set<String>> vehicleDriverMapping = new HashMap<>();

        for(int i=0; i < vehicles.length; i++) {
            String vehicle = vehicles[i];
            String[] driversArr = drivers[i];

            Set<String> vehicleDrivers = new LinkedHashSet<>(Arrays.asList(driversArr));
            vehicleDriverMapping.put(vehicle, vehicleDrivers);
        }

        System.out.println("Helicopter drivers are : " + vehicleDriverMapping.get("helicopter"));

        // Iterate over collection and printing all items:
        for (String vehicle : vehicleDriverMapping.keySet()) {
            Set<String> vehicleDrivers = vehicleDriverMapping.get(vehicle);
            StringBuilder allDrivers = new StringBuilder();

            for (String driver : vehicleDrivers) {
                allDrivers.append(driver);
                allDrivers.append(", ");
            }

            System.out.printf("%s : %s", vehicle, allDrivers);
            System.out.println();

        }
    }
}
