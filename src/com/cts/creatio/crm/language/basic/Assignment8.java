package com.cts.creatio.crm.language.basic;

public class Assignment8 {
	
	public static void main(String[] args) {
		
		int[] Transactions = {50000, -2000, 3000, -15000, -200, -300, 4000, -3000};

		
		//Print total number of credit and debit transactions completed
		
		System.out.println("Total number of credit and debit transactions completed are : "+Transactions.length);
		
		//for credit transaction
		int credit=0;
		int debit=0;
		int totalcredit=0;
		int debittotal=0;
		int suspiciousTransactions=0;
		int notsuspiciousTransactions=0;
		for (int tran:Transactions)
		{
			if(tran>0)
			{
				credit++;
				totalcredit+=tran;
				if (tran>10000)
				{
					suspiciousTransactions++;
					System.out.println("Transaction is suspisious: "+tran);
				}
				else
				{
					notsuspiciousTransactions++;
					System.out.println("Transaction is not suspisious: "+tran);
				}
			}
			else
			{
				debit++;
				debittotal-=tran;
			}
		}
		int balance=totalcredit-debittotal;
		System.out.println("Total number of credit transactions completed are: "+credit);
			System.out.println("Total number of debit transactions completed are: "+debit);
			System.out.println("Total amount remaining at the end in Bank Account:" +balance);
			System.out.println("Print the total amount credited in account:"+totalcredit);
			System.out.println("Print the total amount debited in account:"+debittotal);
			System.out.println("Transaction is suspisious: "+suspiciousTransactions);
			System.out.println("Transaction is not suspisious: "+notsuspiciousTransactions);
		}
		
			
	}

