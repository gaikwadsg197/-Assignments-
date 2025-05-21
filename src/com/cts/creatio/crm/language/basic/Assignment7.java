package com.cts.creatio.crm.language.basic;

public class Assignment7 {

	
	public static void main(String[] args) {
		String customerName = "John Doe";
		int creditscore=720;
		int income=55000;
		boolean employstat=true;
		int dti=35;
		
		if(creditscore>=750)
		{
			System.out.println("The loan is automatically approved");
		}
		
		else if (creditscore<750 && creditscore>=650)
		{
			System.out.println("Additional checks are performed");
		}
		
		
		else if (creditscore < 650)
		{
			System.out.println("The loan is denied");
		}
		
		if (income>=50000)
		{
			System.out.println("The system checks whether the customer is employed");
		}
			
		if (income>=50000 && employstat)
		{
			System.out.println("The system checks the debt-to-income (DTI) ratio");
		}
		
		if (dti<40)
		{
			System.out.println("The loan is approved for "+customerName);
		}
		
		else if(dti>40)
		{
			System.out.println("The loan is denied for "+customerName);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
