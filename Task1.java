// To Generate a random number within a specified range as 1-100

import java.util.*;
import java.io.*;

class Task1
{
    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);
        int attempt = 0, attempt1 = 0, iNo = 0, score = 0, var = 0;
        int x = 37;

        System.out.println("Entered in Round 1 of Game !!!");
        while(attempt != 10)
        {
            
            System.out.println("Enter the number which you have guessed between 0-100:");
            iNo = sobj.nextInt();

            if(iNo == x)
            {
                System.out.println("Hoyyah!! Guessed number is correct..");
                System.out.println("The number is :"+iNo);
                System.out.println("Score of round 1 : "+(-10*attempt+10));
                break;
            }
            else if((iNo > x) && (iNo < (x+10)))
            {
                System.out.println("oops!!It was close...Enter smaller Number");
                
            }
            else if(iNo > x)
            {
                System.out.println("Sorry!!Wrong guess...Enter smaller Number");
            }
            else if((iNo < x) && (iNo > (x-10)))
            {
                System.out.println("oops!!It was close...Enter larger Number");
            }
            else if(iNo < x)
            {
                System.out.println("Sorry!!Wrong guess...Enter larger Number");
            }
            attempt++;
            System.out.println("Number of Attempts remain :"+(10-attempt));
            System.out.println("Score : "+(-10*attempt));
            System.out.println();
        }
        System.out.println("No more Attempts left!!!");
        System.out.println("Score After Round 1 : "+(-10*attempt));
        System.out.println();

        System.out.println("Do you want to enter in Round 2 [1/0]");
        var = sobj.nextInt();
        if(var == 1 )
        {
            System.out.println("------------------------------------------------------------");
            System.out.println("Entered in Round 2 of game!!!");
            while(attempt1 != 10)
            {
                System.out.println("Enter the number which you have guessed between 0-100:");
                iNo = sobj.nextInt();

                if(iNo == x)
                {
                    System.out.println("Hoyyah!! Guessed number is correct..");
                    System.out.println("The number is :"+iNo);
                    System.out.println("Score of round 1 : 100");
                    break;
                }
                else if((iNo > x) && (iNo < (x+10)))
                {
                    System.out.println("oops!!It was close...Enter smaller Number");
                    
                }
                else if(iNo > x)
                {
                    System.out.println("Sorry!!Wrong guess...Enter smaller Number");
                }
                else if((iNo < x) && (iNo > (x-10)))
                {
                    System.out.println("oops!!It was close...Enter larger Number");
                }
                else if(iNo < x)
                {
                    System.out.println("Sorry!!Wrong guess...Enter larger Number");
                }
                attempt1++;
                System.out.println("Number of Attempts remain :"+(10-attempt1));
                System.out.println("Score : "+(-10*attempt1));
                System.out.println();
            }
            System.out.println("No more Attempts left!!!");
            System.out.println("Score After Round 2 : "+(-10*attempt1));
            System.out.println();
        }
        
        else if(var == 0)
        {
            System.out.println("Exited out of game!!!");
        }
        
        sobj.close();
    }
}