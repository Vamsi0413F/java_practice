package street2;
import street1.Home;

public class Office {
	public static void main(String[] args) {
		 Home home = new Home();
		 System.out.println(home.a);
		 System.out.println(home.b); //compilation error
		 System.out.println(home.c);
		 System.out.println(home.d);
		 home.display();
		 home.set_a(100);
		 home.set_b(200);
		 home.set_c(300);
		 home.set_d(400);
		 home.display();
		 System.out.println(home.add(10, 20));
		 System.out.println(home.add(10.5, 20));
	}
}
