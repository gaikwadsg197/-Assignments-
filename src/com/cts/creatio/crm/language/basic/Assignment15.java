package com.cts.creatio.crm.language.basic;

public class Assignment15 {

	/******* String sentence = "Java programming is fun and challenging" ********/

	// Count the total number of words in the sentence.

	public static void main(String[] args) {

		String s = "Java programming is fun and challenging";

		int count = 1;

		for (int i = 0; i < s.length() - 1; i++) {
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
				
			{
				count++;
			}

		}
		System.out.println("Number of words in String are: "+count);
		
		
		//Print the sentence words in reverse order.
		
		String [] words=s.split(" ");
		
		{
			
			
			String reversestring=" ";
			
			for (int i=0; i< words.length;i++)
			{
				String word=words[i];
				String nstr="";
				char ch;
						
				for (int j=0; j<word.length();j++)
				{
				ch=word.charAt(j);
				nstr=ch+nstr;
				
			}
				reversestring= reversestring+nstr+" ";	
		}
			System.out.println(reversestring);
	}
		
					
		//Convert the first character of each word to uppercase and print original sentence
			String uppercase="";
			
			String uppercaseSentence = "";
			for(String word : words) {
				uppercaseSentence=uppercaseSentence+word.substring(0,1).toUpperCase()+word.substring(1)+" ";
			}
			System.out.println("Uppercase Sentence is :"+uppercaseSentence);

}

}