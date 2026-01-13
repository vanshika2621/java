// Write a program to swap two numbers without using third variable.

public class day1x6{
    public static void main(String[]args){
        int a = 10 ;
        int b = 20 ;
        a = a+b ;
        b = a-b;
        a = a-b;
        System.out.printf("Swapped values are: %d %d",a ,b);
    }
}