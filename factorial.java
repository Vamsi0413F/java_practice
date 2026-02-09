package java_practice;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number :");
		int n = sc.nextInt();
		int factorial = 1 ;
		for(int i=1;i<=n;i++) {
			factorial*=i;
		}
		System.out.print("the factorial of "+n+" is :"+factorial);
		
	}

}
