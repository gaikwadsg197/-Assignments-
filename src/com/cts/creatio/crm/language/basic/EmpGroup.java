package com.cts.creatio.crm.language.basic;

public class EmpGroup extends Employee {

	public static void main(String[] args) {
		
		EmpGroup data =new EmpGroup();
		String [] EmpName=new String[3];
		
		EmpName [0]=data.Emp1;
		EmpName [1]=data.Emp2;
		EmpName [2]=data.Emp3;
		
		int [] EmpID=new int[3];
		
		EmpID [0]=data.ID1;
		EmpID [1]=data.ID2;
		EmpID [2]=data.ID3;
		
		System.out.println("Employee Name: "+EmpName [0]+" and Employee ID: "+EmpID [0]);
		System.out.println("Employee Name: "+EmpName [1]+" and Employee ID: "+EmpID [1]);
		System.out.println("Employee Name: "+EmpName [2]+" and Employee ID: "+EmpID [2]);
						}

}
