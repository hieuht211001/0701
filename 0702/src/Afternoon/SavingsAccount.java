package Afternoon;

import java.util.Scanner;

public class SavingsAccount extends BankAccount
{
    private int iCurrentRound;
    private final int iFinalRound;
    private double[] dDepositperRound = new double[iCurrentRound];

    public SavingsAccount(int _iCurrentRound, int _iFinalRound, double[] _dDepositperRound)
    {
        this.iCurrentRound = _iCurrentRound;
        this.iFinalRound = _iFinalRound;
        this.dDepositperRound = _dDepositperRound;
    }

    @Override
    public void withDraw()
    {
        if (iCurrentRound < iFinalRound) return;
        super.withDraw();
    }

    public void deposit()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: ");
        double amount = sc.nextDouble();
        if (amount <= 0 || amount != dDepositperRound[iCurrentRound])
        {
            System.out.println("Insufficient Funds");
            return;
        }
        super.deposit();
        iCurrentRound++;
    }
}
