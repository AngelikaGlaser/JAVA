package WEEK_8.Ex_9;

import java.util.ArrayList;
import java.util.HashMap;


public class Exercise_9 {
    public static void main(String[] args) {
        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        ArrayList<RegistrationPlate> finnish = new ArrayList<>();
        finnish.add(reg1);
        finnish.add(reg2);

        RegistrationPlate newRegistrationPlate = new RegistrationPlate("FI", "ABC-123");
        if (!finnish.contains(newRegistrationPlate)) {
            finnish.add(newRegistrationPlate);
        }

        System.out.println("Finnish: " + finnish);

        HashMap<RegistrationPlate, String> owners = new HashMap<>();
        owners.put(reg1, "Arto");
        owners.put(reg3, "Jürgen");

        System.out.println("owners:");
        System.out.println(owners.get(new RegistrationPlate("FI", "ABC-123")));
        System.out.println(owners.get(new RegistrationPlate("D", "B WQ-431")));

        VehicleRegister vehicleRegister = new VehicleRegister();

        boolean result1 = vehicleRegister.add(reg1, "Arto");
        System.out.println("Add result for reg1: " + result1); // true

        boolean result2 = vehicleRegister.add(reg2, "Bob");
        System.out.println("Add result for reg2: " + result2); // true

        boolean result3 = vehicleRegister.add(reg1, "Charlie");
        System.out.println("Add result for reg1 (again): " + result3); // false

        System.out.println("Owners map: " + vehicleRegister.owners);

        String owner1 = vehicleRegister.get(reg1);
        System.out.println("Owner for reg1: " + owner1);

        String owner2 = vehicleRegister.get(new RegistrationPlate("US", "XYZ-789"));
        System.out.println("Owner for non-existent plate: " + owner2);

        // Delete information for reg1
        boolean deleteResult1 = vehicleRegister.delete(reg1);
        System.out.println("Delete result for reg1: " + deleteResult1); // true

        // Try to delete non-existent information
        boolean deleteResult2 = vehicleRegister.delete(new RegistrationPlate("US", "XYZ-789"));
        System.out.println("Delete result for non-existent plate: " + deleteResult2); // false

        // Print owners map after deletion
        System.out.println("Owners map after deletion: " + vehicleRegister.owners);

        // Print all registration plates
        vehicleRegister.printRegistrationPlates();

        // Print all unique car owners
        vehicleRegister.printOwners();

    }
}
