import java.util.*;
class atm
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int balance=100000,c,w,d;//w=withdraw  d=deposit c=choice
        while(true)
        {
            System.out.println("Automated Teller Machine ");
            System.out.println("Choose 1 for withdraw \n 2 for desposit \n3. for balnce\n 4.exit");
                c=obj.nextInt();
                switch (c)
                {
                    case 1:
                        System.out.println("Enter the amount to withdraw : ");
                        w=obj.nextInt();
                        if(balance>=w)  
                        {
                            balance=balance-w;
                        } 
                        else
                        {
                            System.out.println("Insufficent balance");
                        }
                        break;
                    case 2:
                        System.out.println("Enter the amount to deposit : ");
                        d=obj.nextInt();
                        balance=balance+d;
                        break;
                    case 3:
                        System.out.println("Balance is "+balance);
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        break;
                }
        }

    }
}
