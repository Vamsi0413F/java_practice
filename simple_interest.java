package example;
import java.util.Scanner;
public class simple_interest {
	public static void main(String[] args) {
		Scanner scaning=new Scanner(System.in);
		System.out.println("Enter the principle amount ");
		int P=scaning.nextInt();
		System.out.println("Enter the Rate of interest ");
		Float R=scaning.nextFloat();
		System.out.println("Enter the time ");
		int T=scaning.nextInt();
		Float simple_interest = (P*R*T)/100;
		System.out.println("The simple interest is :"+simple_interest);
		
	}
}
