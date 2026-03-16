import java.util.Scanner;
public class longestcontinuouschain {

	public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int length=0;
        int prev_num=-2;
        int max_length=0;
        while(true){
            System.out.print("Enter number :");
            int num = Sc.nextInt();
            if(num==-1){
                break;
            }
            if(num>prev_num){
                length++;}
            else{
                    length=1;
                }
            
            if(length>max_length){
                max_length=length;
            }
            prev_num=num;

        }
        System.out.print(max_length);
    }
}