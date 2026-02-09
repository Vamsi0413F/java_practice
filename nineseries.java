package java_practice;
import java.util.Scanner;
public class nineseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number you want");
		int n = sc.nextInt();
		int sum = 0 , t =0;
		for(int i =1;i<=n;i++) {
			t=10*t+9;
			sum+=t;
		}System.out.print(sum);
	}

}
