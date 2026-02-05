package java_practice;
import java.util.Scanner;
public class numbertrianglenoinc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number you want");
		int n = sc.nextInt();
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.print("\n");
		}
	}
}
