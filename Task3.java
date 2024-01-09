import java.util.*;
import java.io.*;

class Task3
{
    public static void Withdraw(int Wd1, int Bal1)
    {
        
        if(Wd1 <= Bal1)
        {
            System.out.println("Withdrwal of "+Wd1+" Rs is Successful!!!\n");
        }
        else
        {
            System.out.println("Enter valid amount..");
        }
    }

    public static void Deposit(int dep1 )
    {
        System.out.println("Deposit of "+dep1+" Rs is Successful!!!\n");
        
    }

    public static void CheckBal(int Check)
    {
        System.out.println("Current balance is : "+Check+"\n");
        
    }

    public static void TransHis(int Wd1, int Bal1,int dep1)
    {
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Withdrwal\t\tDeposite\t\tRemaining");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println(Wd1+"\t\t\t"+dep1+"\t\t\t"+Bal1);
        System.out.println();
        System.out.println("--------------Transaction completed--------------");
    }

    public static void main(String Args[]) throws InterruptedException
    {
        Scanner sobj = new Scanner(System.in);
        Timer time = new Timer();

        int ent = 0, cont = 0,dep = 0, wait = 0, opt = 0, Wd = 0, Bal = 50000 ,pin = 0,ppin = 0,gpin =0 ,dpin = 00;
        System.out.println("\n**********ATM INTERFACE**********\n");
        System.out.println("Please insert the card...");
        System.out.println("Press [1] Once card is inserted...");
        ent = sobj.nextInt();
        
        if(ent == 1)
        {
            wait = 40000;
        }

        time.schedule(new MyTimerTask(), wait);

        if(ent == 1)
        {
            System.out.println("Card inserted successfully!!!");
            System.out.println();
            System.out.println("<<<Wait....Loading>>>");

            Thread.sleep(3000);

            System.out.println();
            

            do
            {
                System.out.println("\nSelect the Task to be performed ->");
                System.out.println("[0] Withdraw \n[1] Deposit\n[2] Check Balance\n[3] Show Transaction History\n[4] Pin Change");
                opt = sobj.nextInt();

                switch(opt)
                {
                    case 0:
                        System.out.print("Enter the amount (INR) :");
                        Wd = sobj.nextInt();
                        System.out.print("Enter the PIN:");
                        pin = sobj.nextInt();
                        if(pin == dpin)
                        {
                            Withdraw(Wd,Bal);
                            Bal = Bal-Wd;
                        }
                        else
                        {
                            System.out.println("PIN entered is incorrect!!!");
                        }
                        break;

                    case 1:
                        System.out.print("Enter the amount (INR) :");
                        dep = sobj.nextInt();
                        Deposit(dep);
                        Bal = Bal+dep;
                        break;

                    case 2:
                        CheckBal(Bal);
                        break;

                    case 3:
                        TransHis(Wd,Bal,dep);
                        break;

                    case 4:
                        System.out.println("Enter the prevoius PIN :");
                        ppin = sobj.nextInt();
                        if(ppin == pin)
                        {
                            System.out.println("Enter new PIN :");
                            gpin = sobj.nextInt();
                            ppin = gpin;
                            dpin = gpin;
                            System.out.println("PIN updated successfully!!!");
                        }
                        else
                        {
                            System.out.println("PIN mismatched!!!");
                        }
                        break;

                    default:
                        System.out.println("Card not inserted!!! Please try Again...");
                        return;
                }
                System.out.println("Do you want to continue :[1/0]");
                cont = sobj.nextInt();        
            } while(cont == 1);
            if(cont == 0)
            {
                System.out.println("**********Thanku**********");
            }
        }
        else
        {
            System.out.println("Card not Inserted !!!");
        }
        
    }

    static class MyTimerTask extends TimerTask 
    {
        @Override
        public void run() 
        {
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("-------------------------------!!Session Timed Out!!-----------------------------------");
        }
    }
}


