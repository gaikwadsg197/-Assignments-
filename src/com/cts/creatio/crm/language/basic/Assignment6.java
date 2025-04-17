package com.cts.creatio.crm.language.basic;

public class Assignment6 {

	public static void main(String[] args) {

		String[] name=new String[3];
		
		name[0]="Suresh";
		name[1]="Mahesh";
		name[2]="Naresh";
		
		int [] marks=new int[3];
		
		marks[0]=75;
		marks[1]=80;
		marks[2]=82;
		
		int [] updatedmarks=new int[3];
		
		updatedmarks[0]=marks[0]+=10;
		updatedmarks[1]=marks[1]+=10;
		updatedmarks[2]=marks[2]+=10;
		System.out.println(name[0]+": "+updatedmarks[0]);
		System.out.println(name[1]+": "+updatedmarks[1]);
		System.out.println(name[2]+": "+updatedmarks[2]);
		System.out.println("Average marks of all students: "+((updatedmarks[0]+updatedmarks[1]+updatedmarks[2])/3));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
