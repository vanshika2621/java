// Write a program to reverse a number 
import java.util.Scanner; 

public class day1x4{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev=0,digit ;

        while(num != 0){
            digit= num%10 ;
            rev = rev + digit ;
            num = num/10;
        }
        System.out.printf("the reverse of a number is : %d", rev);

        

    }
}
