// Main.java
import street1.Neighbour;
import street2.Office;
import street2.Relative;

public class Main {
    public static void main(String[] args) {
        System.out.println("Access within the same package:");
        Neighbour neighbour = new Neighbour();
        neighbour.checkAccess();

        System.out.println("\nAccess from Office - a different package:");
        Office office = new Office();
        office.checkAccess();
        
        System.out.println("\nAccess from Relative - a different package (via inheritance):");
        Relative relative = new Relative();
        relative.checkAccess();
    }
}
