package com.exepmycompany.bank;
public class CheckingAccount extends BankAccount
{
    private double ic=0.02;
    private double interest;
    
    @Override
    public double calculateInterest()
    {
        interest=ic*getBal();
        return interest;
    }
    
}
