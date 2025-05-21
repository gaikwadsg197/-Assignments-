package com.cts.creatio.crm.language.basic;


public class Assignment13 {
	
	/*prime number- Given a number n, determine whether it is a prime number or not. A prime number is a
	number greater than 1 that has no positive divisors other than 1 and itself.*/
	

	
	public static void main(String[] args)	{
		
		int num = 7;
		
		if(isPrime(num))
		{
			System.out.println("Number is prime number");
		}
		else
		{
			System.out.println("Number is not prime number");
		}
	}
	public static boolean isPrime(int num) 
	{
        for(int i=2;i<=num/2;i++)
        {
        	if(num%i==0)
        	{
        		return false;
        	}
        }
        return true;
    }


}
