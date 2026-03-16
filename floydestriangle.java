package java_practice;
import java.util.Scanner;
public class floydestriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number you want");
		int n = sc.nextInt();
		int num=0;
		for (int i = 0; i<=n;i++) {
			for (int j = 0; j<=i;j++) {
				if((i+j)%2 ==0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}System.out.print("\n");
		}
	}

}
