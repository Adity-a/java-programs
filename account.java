import java.util.Scanner;

class account
{
   public String nameofdepositor;
   public String accounttype;
   public int accountnumber;
   public double balanceamount;

   Scanner sc = new Scanner(System.in);
    public void accountopen()
     {
         System.out.println("Enter name of account holder");
         nameofdepositor = sc.next();
         System.out.println("Enter account number");
         accountnumber = sc.nextInt();
         System.out.println("Enter account type");
         accounttype = sc.next();
         System.out.println("Enter balance amount");
         balanceamount = sc.nextdouble();
     }

     public void show()
     {
        System.out.println("Name of account holder is: " +nameofdepositor);
        System.out.println("balance amount is: " +balanceamount);
     }

     public void deposit()
     {
        double amount;
        System.out.println("Entern amount you want to deposit");
        amount = sc.nextdouble();
        balanceamount = balanceamount + amount;

     }

     public void withdraw()
     {
        double amount;
        System.out.println("Enter amount you want to withdraw");
        amount = sc.nextdouble();
        
        if(balanceamount >= amount)
        {
           balanceamount = balanceamount - amount;
           System.out.println("balance after withdrawl is: " +balanceamount);
        }
        else
        {
           System.out.println("You don't have sufficient amount in yor account!!!");
        }

     }


      public static void main(String args[])
      {
           Scanner input = new Scanner(System.in);
           int ch;
         do
         {
           
            System.out.println("Enter 1 for opening account");
            System.out.println("Enter 2 to show account details");
            System.out.println("Enter 3 to deposit amount");
            System.out.println("Enter 4 to withdraw amount");
            System.out.println("Enter 5 for exit");
            System.out.println("Enter your choice");
            ch = input.nextInt();

            switch(ch)
            {
                case 1:
                  accountopen();
                   break;
                case 2:
                  show();
                   break;
                case 3:
                  deposit();
                   break;
                case 4:
                  withdraw();
                   break;
                case 5:
                   break;
                default:
                  System.out.println("enter valid choice!!!");
            }
         }while(ch!=5);
     }
}
     


    
