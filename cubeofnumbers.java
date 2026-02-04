import java.util.Scanner;
public class cubeofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("The number to find it's cube :");
		int n = sc.nextInt();
		System.out.print("The cube is  " + Math.pow(n, 3));
	}

}
