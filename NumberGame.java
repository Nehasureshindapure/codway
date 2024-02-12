import java.util.Random;
import java.util.Scanner;
public class NumberGame{
   
        private static final Random r=new Random();
        private static int rno;
         private static int userInput;
        

	public static void main(String[] args) {
         rno=r.nextInt(100)+1;
    while (true){
        Scanner sc=new Scanner(System.in);
        System.out.println("Guess the number between 1 and 100");
          userInput=sc.nextInt();
        if(rno==userInput)
        {
	  System.out.println(" Well Done !!Guess is Correct.....");
           break;
				
	}
	else if(rno>userInput)
       {
	System.out.println(" Sorry.....Guess is too low !!");
     }
   else if(rno<userInput)
       {
	System.out.println("Sorry.....Guess is too high !!");
     }
   else
   {
    System.out.println("Guess valid number");
   }
			
 }
}
}