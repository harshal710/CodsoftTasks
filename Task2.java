// Student Grade Calculator

import java.util.*;
import java.io.*;

class Task2
{
    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);
        int Sum  = 0, Total = 0,Count = 0;
        float Avg = 0.0f;

        System.out.println("\n-----------Welcome to Grade Calculator-----------\n");
        System.out.println("Enter the number of subjects :");
        Count = sobj.nextInt();
        System.out.println("Enter the Subject wise obtained marks out of 100 :");
        String Ret = null;

        for(int i = 1; i <= Count; i++)
        {
            System.out.println("Enter the marks obtained in subject "+i+" :");
            Sum = sobj.nextInt();

            Total = Total + Sum;
        }

        Avg = Total/Count ;
        if(Avg < 30)
        {
            Ret = "Fail";
        }
        else if (Avg >= 30 && Avg < 40) 
        {
            Ret = "F";
        }
        else if (Avg >= 40 && Avg < 50) 
        {
            Ret = "E";
        }
        else if (Avg >= 50 && Avg < 60) 
        {
            Ret = "D";
        }
        else if (Avg >= 60 && Avg < 70) 
        {
            Ret = "C";
        }
        else if (Avg >= 70 && Avg < 80) 
        {
            Ret = "B";
        }
        else if (Avg >= 80 && Avg < 90) 
        {
            Ret = "A";
        }
        else if (Avg >= 90 && Avg <= 100) 
        {
            Ret = "A++";
        }
        else
        {
            System.out.println("Input value is wrong!!!");
        }
        
        System.out.println("------------------------------RESULT----------------------------------");
        
        System.out.println();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Obtained Marks\t Total Marks\tAverage\t\tGrade");
        System.out.println("----------------------------------------------------------------------");
        System.out.println(Total+" \t\t 600\t\t"+Avg+"\t\t"+Ret);
        System.out.println("----------------------------------------------------------------------");

        sobj.close();
    }
}