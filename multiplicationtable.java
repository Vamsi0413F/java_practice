import java.util.Scanner;
public class multiplicationtable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the multiplication table you want");
		int n = sc.nextInt();
		for(int i=0;i<11;i++) {
			System.out.print(n+"X"+i+"="+n*i +"\n");
		}
	}
}
