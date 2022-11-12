import java.util.*;
import java.awt.*;
import java.awt.Event.*;
import javax.swing.*;
class pro_rps
{
    public static void main(String args[])
    {
        pro_rps obj = new pro_rps();
        obj.check();
    }
    void check()
    {
        Scanner obj = new Scanner(System.in);
        int a,player=0,computer=0;
        System.out.println("Enter number corresponding to the objects :");
        System.out.println("0. Rock ");
        System.out.println("1. Paper ");
        System.out.println("2. Scissor ");
        System.out.println("3. end the game");
        do
        {

            a = obj.nextInt();
            pro_rps obj1 = new pro_rps();
            int b = obj1.computer();
            if(a==b)
            {
                System.out.println("Its tie");
            }
            else if(a==0 && b==2)
            {
                System.out.println("Player wins ");
                player++;
                System.out.println("player : "+player);
            }
            else if(a==0 && b==1)
            {
                System.out.println("Computer wins ");
                computer++;
                System.out.println("computer : "+computer);
            }
            else if(a==1 && b==0)
            {
                System.out.println("Player wins ");
                player++;
                System.out.println("player : "+player);
            }
            else if(a==1 && b==2)
            {
                System.out.println("Computer wins ");
                computer++;
                System.out.println("computer : "+computer);
            }
            else if(a==2 && b==1)
            {
                System.out.println("Player wins ");
                player++;
                System.out.println("player : "+player);
            }
            else if(a==2 && b==0)
            {
                System.out.println("Computer wins ");
                computer++;
                System.out.println("computer : "+computer);
            }
            else if(a==3)
            {
                System.out.println("\n\n ");
                if(computer<player)
                {
                    System.out.println("player wins the match....");
                }
                else if(computer>player)
                {
                    System.out.println("computer wins the match....");
                }
                else
                {
                    System.out.println("match ties....");
                }
            }
        }while(a!=3);
    }
    int computer()
    {
        Random ran = new Random();
        int b = ran.nextInt(3);
        return b;
    }
}