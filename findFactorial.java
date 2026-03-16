package java_practice;
import java.util.Scanner;
public class findFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number you want :");
		int num = sc.nextInt();
		int factorial =1;
		if(num!=0 && num>0) {
			for(int i=1;i<=num;i++) {
				factorial*=i;
			}
			System.out.print("the factorial is :" + factorial );
		}
		else {
			System.out.print("1");
		}
	}

}
