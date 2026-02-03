package java_practice;
import java.util.Scanner;
public class feb_12026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;  
                num /= 10;      
            }
            num = sum;
        }
        System.out.println("The single-digit sum is: " + num);
        sc.close();
    }

	}

