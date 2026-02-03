package java_practice;
import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String to check if it is palindrome or not");
		String n = sc.nextLine();
		String reversed_n="";
		for (int i = 0; i<n.length(); i++ ) {
			reversed_n+=n.charAt(i);
		}
		if(n.equals(reversed_n)) {
			System.out.print("True");
		}
		else {
			System.out.print("false");
		}
			
		
	}
}
