import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Truck truck = new Truck();
        truck.setMake("Tesla");
        truck.setModel("Halo Truck Boyyyyy");
        truck.setEngineType("Hemi");
        truck.setNumOfDoors(8);
        truck.setNumOfWheels(10);

        System.out.println(truck);

        List<String> safetyFeatures = new ArrayList<String>();
        safetyFeatures.add("Seatbelts");
        safetyFeatures.add("Airbags");
        safetyFeatures.add("Regular Stuff To Protect You");
        safetyFeatures.add("Two Crows");

        Sedan sedan = new Sedan();
        sedan.setMake("Honda");
        sedan.setModel("Civic");
        sedan.setEngineType("Lawnmower");
        sedan.setNumOfDoors(4);
        sedan.setNumOfWheels(4);
        sedan.setSafetyFeatures(safetyFeatures);

        System.out.println(sedan + "\n" + "This car has the following safety features: " + sedan.getSafetyFeatures());
    }
}
