package com.exepmycompany.exceptionhandling2;
import java.util.Scanner;
public class ExceptionHandling2
{
    public static void main(String[] args)
    {
        int[] numbers={1,2,3,4,5};
        
        try
        {
            int value=numbers[10];
            System.out.println("Value: "+value);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error:Array Index is out of bounds.\n"+e);
        }
    }
}
