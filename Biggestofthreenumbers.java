package example;
import java.util.Scanner;
public class Biggestofthreenumbers {

	public static void main(String[] args) {
		Scanner scaning=new Scanner(System.in);
		System.out.println("Enter the First number");
		int a=scaning.nextInt();
		System.out.println("Enter the Second number");
		int b=scaning.nextInt();
		System.out.println("Enter the third number");
		int c=scaning.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.println("the largest number is "+ a);
			}
			else {
				System.out.println("the largest number is "+ c);
			}
		}
		else {
			if(b>c) {
				System.out.println("the largest number is "+ b);
			}
			else {
				System.out.println("the largest number is "+ c);
			}
		}
	}

}
