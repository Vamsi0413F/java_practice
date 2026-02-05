package java_practice;
import java.util.Scanner;

public class numbertriangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of stars you want");
		int n=sc.nextInt();
		int num = 1;
		for(int i =0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ".repeat(n+1-i)+num);
				num++;
			}
			System.out.print("\n");
		}
	}
}
