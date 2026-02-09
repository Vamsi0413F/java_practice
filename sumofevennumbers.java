package java_practice;
import java.util.Scanner;
public class sumofevennumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number you want :");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=0;i<=n;i++) {
			sum+=(2*i);
		}System.out.print(sum);
	}

}
