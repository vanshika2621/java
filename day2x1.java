// Stone paper scissors 
import java.util.Scanner; 

public class day2x1{
    public static void main(String[]args){
        System.out.println("1-Stone; 2-Paper; 3-Scissor ; Anyother no. to Stop\n");
        Scanner sc = new Scanner(System.in);
        
        
        boolean choice = true;
        while(choice == true){
            System.out.println("Player 1 Enter your move: \n");
            
            int user1 = sc.nextInt();
            System.out.println("Player 2 Enter your move: \n");
            int user2 = sc.nextInt();

        
                    if(user1 == 1 && user2== 2)
                         System.out.println("Player 2 wins");
                    else if(user1 ==1 && user2 == 3)
                        System.out.println("Player 1 Wins");
                    else if(user1 == 2 && user2 == 1)
                        System.out.println("Player 1 Wins");
                    else if(user1 == 2 && user2 == 3)
                        System.out.println("Player 2 Wins");
                    else if (user1==3 && user2==1 )
                        System.out.println("Player 2 Wins");
                    else if(user1==3 && user2 ==2)
                        System.out.println("Player 1 Wins");
                    else if(user1 == user2)
                        System.out.println("It's a tie");
                    else{
                        System.out.println("Game Over!!");
                        choice = false;
                    }  
        }
        
        sc.close() ;
    }

}

