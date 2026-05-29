// Home.java (Base Class)
package street1;

public class Home {
    private String secretKey = "1234";  // Only accessible within Home
    protected String familyName = "Mohan";  // Accessible to subclasses (even in different packages)
    public String address = "Door 5, Street1";  // Accessible from anywhere
    String dailyRoutine = "Morning Walk";  // Default (accessible within package)
    
    public void showDetails() {
        System.out.println("Secret Key: " + secretKey);
        System.out.println("Family Name: " + familyName);
        System.out.println("Address: " + address);
        System.out.println("Daily Routine: " + dailyRoutine);
    }
}
