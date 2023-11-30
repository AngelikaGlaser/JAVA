package WEEK_8.Ex_9;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class VehicleRegister {
    public final HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<>();
    }

    public boolean add(RegistrationPlate plate, String owner){
        if (!owners.containsKey(plate)) {
            owners.put(plate, owner);
            return true;  // Car had no owner, successfully added
        } else {
            return false; // Car already had an owner, nothing was done
        }
    }

    public String get(RegistrationPlate plate){
        return owners.getOrDefault(plate, null);
    }

    public boolean delete(RegistrationPlate plate){
        if (owners.containsKey(plate)){
            owners.remove(plate);
            return true;
        } else {
            return false;
        }
    }

    public void printRegistrationPlates() {
        System.out.println("Registration Plates:");
        for (RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        System.out.println("Car Owners:");
        Set<String> uniqueOwners = new HashSet<>();
        for (String owner : owners.values()) {
            if (uniqueOwners.add(owner)) {
                System.out.println(owner);
            }
        }
    }
}
