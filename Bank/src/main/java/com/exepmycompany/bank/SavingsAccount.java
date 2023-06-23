package com.exepmycompany.bank;
public class SavingsAccount extends BankAccount
{
    private double ic=0.12;
    private double interest;
    
    @Override
    public double calculateInterest()
    {
        interest=ic*getBal();
        return interest;
    }
    
}
