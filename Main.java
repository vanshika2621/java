import java.util.Scanner; 
public class Main {
    
    public static void main(String[] args) {
        System.out.println("Start"); 
        int num = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in); 
        System.out.println("Guess a number between 0 and 99: ");
        while (true) {
            int guess = sc.nextInt(); 
            if (guess < num) {
                System.out.println("Too low! Try again: ");
            } else if (guess > num) {
                System.out.println("Too high! Try again: ");
            } else {
                System.out.println("Congratulations! You've guessed the number.");
                break;
            }
        }
    }
}