// Write a program to find the largest of two numbers.
import java.util.Scanner;

public class dayx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.println("Enter your first number ");
        int num1 = sc.nextInt() ;
        System.out.println("Enter your first number ");
        int num2 = sc.nextInt();
        
        if (num1> num2){
            System.out.println("num1 is bigger: " + num1); 
        }
        else if(num2> num1){
            System.out.println("num2 is biggest: "+ num2);
        }
        else{
            System.out.println("Both are equal");
        }

        

    }
} 