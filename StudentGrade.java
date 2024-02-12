import java.util.Scanner;


public class StudentGrade{
       
     public static void main(String args[])
     { 

         Scanner r=new Scanner(System.in);
        int m1,m2,m3,m4,m5,sum;
        double avg;
        
        System.out.println("Enter 5 subject marks out of 100:");
        System.out.println("M1:");
        m1=r.nextInt(); 
        System.out.println("M2:");
        m2=r.nextInt();
        System.out.println("M3:");
        m3=r.nextInt();
        System.out.println("M4:");
        m4=r.nextInt();
        System.out.println("M5:");
        m5=r.nextInt();
     
       sum=m1+m2+m3+m4+m5;
       System.out.println("Sum of marks is:"+sum);
       avg=sum/5;
      
    
        if(avg>85 && avg<=100)
         {
          System.out.println("Average marks is:"+avg);
            System.out.println("Great.... your grade is:Grade O");
          }
          else if(avg>75 && avg<85)
         {
          System.out.println("Average marks is:"+avg);
          System.out.println("Well done.... your grade is:Grade A+");
          }
          else if(avg>65 && avg<75)
         {
          System.out.println("Average marks is:"+avg);
         System.out.println("Well done.... your grade is:Grade A");
          }   
         else if(avg>55 && avg<66)
         {
          System.out.println("Average marks is:"+avg);
           System.out.println("Well done.... your grade is:Grade B");
          }
          else if(avg>45 && avg<55)
         {
          System.out.println("Average marks is:"+avg);
            System.out.println("Well done.... your grade is:Grade C");
          }
        else 
         {
          System.out.println("Average marks is:"+avg);
         System.out.println("Sorry you are....:fail");
          }





         
     }












}