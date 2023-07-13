package com.exepmycompany.exceptionhandling;
import java.util.Scanner;
public class ExceptionHandling 
{
    public static void main(String[] args)
    {
        int n1,n2,ans;
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.println("Enter First number ");
            n1=Integer.parseInt(sc.nextLine());
            System.out.println("Enter Second number ");
            n2=Integer.parseInt(sc.nextLine());
            ans=n1/n2;
            System.out.println("Answer is "+ans);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error");
        }
    }
}
