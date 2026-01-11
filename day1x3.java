//Write a program to find sum of first N natural numbers.
import java.util.Scanner; 

public class day1x3 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter a number: ");
    int num = sc.nextInt(); 
    int sum = num*(num+1)/2 ;
    System.out.printf("The sum of n natural numbers are: %d", sum);


    }


}