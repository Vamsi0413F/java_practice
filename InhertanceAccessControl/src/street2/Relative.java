package street2;

import street1.Home;

public class Relative extends Home {
	public void checkAccess() {
        //System.out.println("Secret Key: " + secretKey); // Not Accessible (private)
        System.out.println("Family Name: " + familyName); // Accessible (protected via inheritance)
        System.out.println("Address: " + address); // Accessible (public)
//        System.out.println("Daily Routine: " + dailyRoutine); // Not Accessible (default)
    }
}
