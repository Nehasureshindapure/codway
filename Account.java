import java.util.Scanner;
public class Account
{
   int accno,amount;
   String accname;
  Scanner r=new Scanner(System.in);
  Account(int accno,String accname,int amount)
    {
       this.accno=accno;
       this.accname=accname;
       this.amount=amount;
    }
   
    int i=0;
       
           void bigB()
        {
             System.out.println("**********BANK OF INDIA**********");
              do{
                 System.out.println("\n 1.Deposit\n 2.Withdraw\n 3.Check Balence\n 4.Exit\n");
                 int ch=r.nextInt();
              switch(ch)
            {
                case 1: deposit();
                         break;
                case 2: withdraw();
                         break;
                case 3: check();
                         break;
                case 4: display();
                         System.exit(0);

            }


        }while(true);

}
    
     void display()
   {

        System.out.println("Enter 4 digit pin :");
        int pin=r.nextInt();
        if(pin==1234)
         { 
            bigB();
         }
         else
        {
            System.out.println("Incorrect Pin");
             display();
         }
   }
    void deposit()
       {
           System.out.println("Enter amount to be deposited:");
           int dep=r.nextInt();
           this.amount+=dep;
           System.out.println("Amount after deposit is:"+this.amount);
     
       }
    void withdraw()
      {
           System.out.println("Enter withdraw amount:");
           int withdraw=r.nextInt();
           if(this.amount>withdraw)
             {
                 this.amount-=withdraw;
                 System.out.println("Amount withdraw Successfully:");

                System.out.println("Remaining Balence is :"+this.amount);
              }
            else
            {
              System.out.println("Insufficient Balence");
            }
       }
        
      void check()
       {
          System.out.println("Balence is:"+amount);
       }
      public static void main(String args[])
       {
            Account a=new Account(876543,"Neha",100000);
            a.display();


       }

}








