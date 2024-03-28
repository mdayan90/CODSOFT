import java.util.Random;
import java.util.Scanner;
public class TASK1 {
    public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int attempt = 1;
		while(true)
	{
		System.out.println("THIS IS THE NUMBER GUESSING GAME ,PLEASE WRITE /ENTER/ TO START THE GAME");
		String play= "ENTER";
		String write= sc.next();
		if(play.equals(write))
		{
		Random dice = new Random();
        int number;
		number= 1+dice.nextInt(100);
	//	System.out.print(number +" ");
		int x;
		while(true)
		{		System.out.println("PLEASE GUESS THE NUMBER BETWEEN 1 TO 100");
			x= sc.nextInt();
		     if(x==number){
		    System.out.println("YOUR GUESSED NUMBER IS CORRECT "+ "in " + attempt + " Attempt");
		    break;
		}
		else if (x> number){
		    System.out.println("YOUR GUESSED IS GREATER THAN THE GENERATED NUMBER");
		attempt ++;
		        }
		    else {
		        System.out.println("YOUR GUESSED NUMBER IS SMALLER THAN THE GENERATED NUMBER");
		        attempt ++;
		    }
		        }
		}
		    
	else{
	 System.out.println("WRITE THE /ENTER/ PROPERLY");
     }
  System.out.println("Do you want to start the game(YES/NO)");
  String ready= "YES";
  String restart= sc.next();
  if(!restart.equals(ready))
  break;

	}
	System.out.println("I HOPE YOU ENJOY THE GAME.");
   }

    
}  

	
		
	