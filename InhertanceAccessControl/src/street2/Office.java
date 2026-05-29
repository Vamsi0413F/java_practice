// Office.java (Subclass in a Different Package)
package street2;
import street1.Home;

public class Office {
	public void checkAccess() {
		Home home = new Home();
//		System.out.println("Secret Key: " + home.secretKey); // Not Accessible (private)
//		System.out.println("Family Name: " + home.familyName); // Not Accessible (protected)
		System.out.println("Address: " + home.address); // Accessible (public)
//		System.out.println("Daily Routine: " + home.dailyRoutine); // Not Accessible (default)
	}
}