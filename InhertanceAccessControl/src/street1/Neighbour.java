// Neighbour.java (Same Package)
package street1;

public class Neighbour {
    public void checkAccess() {
        Home home = new Home();
//        System.out.println("Secret Key: " + home.secretKey); // Not Accessible (private)
        System.out.println("Family Name: " + home.familyName); // Accessible (protected within same package)
        System.out.println("Address: " + home.address); // Accessible (public)
        System.out.println("Daily Routine: " + home.dailyRoutine); // Accessible (default within same package)
    }
}
