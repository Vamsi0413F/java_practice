package java_practice;
import java.util.Scanner;
public class diamondpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number you want");
		int n = sc.nextInt();
		for(int i =0 ; i<=n ; i++) {
			System.out.print(" ".repeat(n-i));
			for(int j = 1; j<=i;j++) {
				System.out.print("*".repeat(2));
			}
			System.out.print("\n");
		}
		for(int k=0; k<n;k++) {
			System.out.print(" ".repeat(k));
			for(int l=n;l>=k+1;l--) {
				System.out.print("*".repeat(2));
			}System.out.print("\n");
		}
	}

}
