package com.exepmycompany.bank;
public class Bank 
{
    public static void main(String[] args) 
    {
        SavingsAccount s=new SavingsAccount();
        s.setAccNo(1234);
        s.setBal(2000000);
        System.out.println("Account number: "+s.getAccNo());
        System.out.println("Balance: "+s.getBal());
        System.out.println("Interest: "+s.calculateInterest());
        
        CheckingAccount c=new CheckingAccount();
        c.setAccNo(6789);
        c.setBal(1000000);
        System.out.println("Account number: "+c.getAccNo());
        System.out.println("Balance: "+c.getBal());
        System.out.println("Interest: "+c.calculateInterest());
    }
}
