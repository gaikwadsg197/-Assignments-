package com.cts.creatio.crm.language.basic;

public class Assignment16 {

	/***********
	 * String paragraph = "Java is a popular programming language. Java is used for
	 * web development, mobile applications, and more.";
	 *********/

	public static void main(String[] args) {
		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
		
		
		String words=paragraph.replaceAll("[.,]", "");
		
//		System.out.println(words);
		int count=0;
		String [] SplittedText=words.split(" ");
		
//		System.out.println(SplittedText.length);
		
	
			//Divide into multiple words
		for (int i=0;i<=SplittedText.length-1;i++)
		{
			System.out.println(SplittedText[i]);
			
		}
		
		for (int j=0;j<=SplittedText.length-1;j++)
			{
			if(SplittedText[j].equals("Java"))
			{
				System.out.println("Java word is present in Array with Index :"+j);
				count++;
			}
		//Find total number of occurrences
		
	}
		System.out.println("total number of occurrences of word Java is : " +count);
	}
}
