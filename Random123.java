import java.util.*;

public class Random123{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1;
        do{ 
        int number1;
        int num1,num11,i;
        int count1;
         Random random=new Random();
         number1=random.nextInt(100);
         int generatednumber1=number1+1;
         System.out.println("WELCOME TO NUMBER GAME");
         count1=1;
         for(i=1;i<=10;i++){
            System.out.println("guess the number between 1 to 100");
            num1=sc.nextInt();
            if(num1<generatednumber1){
                
                    System.out.println("the guessed number is too low");
                
                count1++;
            }
            else if(num1>generatednumber1){
                
                    System.out.println("the guessed number is too high");
            
                count1++;
            }
            else{
                System.out.println("super the guessed number is equal to generated number");
                count1++;
                System.out.println("you tried for "+count1+"times finally you found the generated random number");
                break;
            }  
         
         if(i==10)
         {
            System.out.println("limitation to attend the game is over so please try again");
            break;
         }
        }
        System.out.println("DO YOU WANT TO PLAY AGAIN(yes:1/no:0)");
        n1=sc.nextInt();
        }while(n1==1); 
    }
}