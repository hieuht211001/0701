package Afternoon;

import java.util.Scanner;

public class BankAccount
{
    private double dBalance;
    private int iPassword;
    Scanner sc = new Scanner(System.in);

    public void withDraw()
    {
        try
        {
            if (!isPasswordMatch()) return;
            System.out.print("Enter withdraw amount: ");
            double dAmount = sc.nextDouble();
            if (dAmount <= this.dBalance)
            {
                this.dBalance -= dAmount;
                System.out.println("Withdraw Completed");
            }
            else
            {
                System.out.println("Withdraw Failed");
            }
        }
        catch (Exception e)
        {
            System.out.println("Invalid Format");
        }
    }

    public void deposit()
    {
        try
        {
            if (!isPasswordMatch()) return;
            System.out.print("Enter deposit amount: ");
            double dAmount = sc.nextDouble();
            if (dAmount <= 0)
            {
                System.out.println("Deposit Failed");
            }
            else
            {
                this.dBalance += dAmount;
                System.out.println("Deposit Completed");
            }
        }
        catch (Exception e)
        {
            System.out.println("Invalid Format");
        }
    }

    private Boolean isPasswordMatch()
    {
        try
        {
            System.out.print("Enter password: ");
            int iInputPassword = sc.nextInt();
            if (iInputPassword != this.iPassword)
            {
                System.out.println("Password does not match");
                return false;
            }
            return true;
        }
        catch (Exception e)
        {
            System.out.println("Invalid Format");
            return false;
        }
    }
}
