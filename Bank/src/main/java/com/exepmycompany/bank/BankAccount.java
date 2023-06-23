package com.exepmycompany.bank;
public abstract class BankAccount 
{
    private int AccNo;
    private double balance;
    
    public void setAccNo(int AccNo)
    {
        this.AccNo=AccNo;
    }
    public int getAccNo()
    {
        return AccNo;
    }
    public void setBal(float balance)
    {
        this.balance=balance;
    }
    public double getBal()
    {
        return balance;
    }
    
    public abstract double calculateInterest();
}
