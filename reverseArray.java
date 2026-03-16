package java_practice;
import java.util.Scanner;
public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Ener the number of elements in the array :");
		int num = sc.nextInt();
		int[] arr =	new int[num];
		System.out.print("enter all the numbers :");
		for(int i=0;i<=num-1;i++) {
			int number = sc.nextInt();
			arr[i]=number;
		}
		 int left = 0;
	     int right = num-1;

	     while (left < right) {
	    	 int c = arr[left];
	    	 arr[left] = arr[right];
	         arr[right] = c;

	         left++;
	         right--;
	     }
	     System.out.print("the reversed array is [" );
	     for(int a=0;a<=arr.length-1;a++) {
	     System.out.print( arr[a]+"," );
	}
	     System.out.print("]" );
	}
}
