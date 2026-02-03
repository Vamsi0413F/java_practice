package example;
import java.util.Scanner;
public class checkNumberNature {
	public static void main(String[] args) {
		Scanner scaning=new Scanner(System.in);
		System.out.println("Enter the number which you want to check");
		int input_number=scaning.nextInt();
		if(input_number==0) {
			System.out.println("The number is neither positive nor negative");
		}
		else if(input_number>0){
			System.out.println("The number is positive ");
		}
		else if(input_number<0){
			System.out.println("The number is negative ");
		}
	}
}
