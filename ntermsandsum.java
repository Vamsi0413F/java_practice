import java.util.Scanner;
public class ntermsandsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to find the sum of n natural numbers using accumilator variable: ");
		int n = sc.nextInt();
		int sum=0;
		System.out.print("the numbers are ");
		for(int i=0;i<n+1;i++) {
			sum+=i;
			
			System.out.print(i);
		}
		System.out.print("The sum is " + sum);
	}

}
