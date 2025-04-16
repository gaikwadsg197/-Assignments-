package com.cts.creatio.crm.language.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment5 {

	public static void main(String[] args) {
		
		Map<String, String> Student1Map = new HashMap<String, String>();
		Student1Map.put("Name", "Jhon Doe");
		Student1Map.put("Age", "20");
		Student1Map.put("Gender", "Male");
		Student1Map.put("Roll Number", "S12345");
		Student1Map.put("Grade", "A");
		Student1Map.put("Major", "Computer Science");
		Student1Map.put("GPA", "3.8");
		Student1Map.put("Email", "john@example.com");
		Student1Map.put("Contact Number", "9876543210");
		Student1Map.put("Address", "123 Elm St");
		System.out.println("Student 1 details :" + Student1Map);
		
		
		
		Map<String, String> Student2Map = new HashMap<String, String>();
		Student2Map.put("Name", "Jane Smith");
		Student2Map.put("Age", "21");
		Student2Map.put("Gender", "Female");
		Student2Map.put("Roll Number", "S12346");
		Student2Map.put("Grade", "B");
		Student2Map.put("Major", "Mathematics");
		Student2Map.put("GPA", "3.5");
		Student2Map.put("Email", "jane@example.com");
		Student2Map.put("Contact Number", "9876543211");
		Student2Map.put("Address", "456 Oak St");
		System.out.println("Student 2 details :" + Student2Map);
		
		
		Map<String, String> Student3Map = new HashMap<String, String>();
		Student3Map.put("Name", "Mike Brown");
		Student3Map.put("Age", "22");
		Student3Map.put("Gender", "Male");
		Student3Map.put("Roll Number", "S12347");
		Student3Map.put("Grade", "A");
		Student3Map.put("Major", "Physics");
		Student3Map.put("GPA", "3.9");
		Student3Map.put("Email", "mike@example.com");
		Student3Map.put("Contact Number", "9876543212");
		Student3Map.put("Address", "789 Pine St");
		System.out.println("Student 3 details :" + Student3Map);
		
		List<Map<String, String>> studentList = new ArrayList<Map<String, String>>();
		
		studentList.add(Student1Map);
		studentList.add(Student2Map);
		studentList.add(Student3Map);
//employee details		
		
		Map<String, String> emp1Map = new HashMap<String, String>();
		emp1Map.put("Name", "Alice Green");
		emp1Map.put("Age", "30");
		emp1Map.put("Gender", "Female");
		emp1Map.put("Department", "Engineering");
		emp1Map.put("Position", "Software Engineer");
		emp1Map.put("Salary", "75000");
		emp1Map.put("Email", "alice@example.com");
		emp1Map.put("Contact Number", "9876543213");
		System.out.println("Employee 1 details :" + emp1Map);
		
		
		Map<String, String> emp2Map = new HashMap<String, String>();
		emp2Map.put("Name", "Bob Johnson");
		emp2Map.put("Age", "35");
		emp2Map.put("Gender", "Male");
		emp2Map.put("Department", "Marketing");
		emp2Map.put("Position", "Marketing Manager");
		emp2Map.put("Salary", "85000");
		emp2Map.put("Email", "bob@example.com");
		emp2Map.put("Contact Number", "9876543214");
		System.out.println("Employee 2 details :" + emp2Map);
		
		
		Map<String, String> emp3Map = new HashMap<String, String>();
		emp3Map.put("Name", "Carol White");
		emp3Map.put("Age", "28");
		emp3Map.put("Gender", "Female");
		emp3Map.put("Department", "Sales");
		emp3Map.put("Position", "Sales Executive");
		emp3Map.put("Salary", "65000");
		emp3Map.put("Email", "Carol@example.com");
		emp3Map.put("Contact Number", "9876543215");
		System.out.println("Employee 3 details :" + emp3Map);
		
		
		List<Map<String, String>> employeeList = new ArrayList<Map<String, String>>();
		
		employeeList.add(emp1Map);
		employeeList.add(emp2Map);
		employeeList.add(emp3Map);
		
//Product details
		
		Map<String, String> prod1Map = new HashMap<String, String>();
		prod1Map.put("Name", "Laptop");
		prod1Map.put("Category", "Electronics");
		prod1Map.put("Price", "1200");
		prod1Map.put("Stock", "50");
		prod1Map.put("Suppliers", "Tech Supplies");
		prod1Map.put("Warrenty", "2 Years");
		prod1Map.put("Rating", "4.5");
		prod1Map.put("Manfacturing Date", "15/1/2023");
		prod1Map.put("Expiry Date", "15/1/2025");
		System.out.println("Product 1 details :" + prod1Map);
		
		
		
		Map<String, String> prod2Map = new HashMap<String, String>();
		prod2Map.put("Name", "Desk Chair");
		prod2Map.put("Category", "Furniture");
		prod2Map.put("Price", "150");
		prod2Map.put("Stock", "100");
		prod2Map.put("Suppliers", "Office Depot");
		prod2Map.put("Warrenty", "1 Years");
		prod2Map.put("Rating", "4");
		prod2Map.put("Manfacturing Date", "10/2/2023");
		prod2Map.put("Expiry Date", null);
		System.out.println("Product 3 details :" + prod2Map);
		
		
		Map<String, String> prod3Map = new HashMap<String, String>();
		prod3Map.put("Name", "Coffee Maker");
		prod3Map.put("Category", "kitchen");
		prod3Map.put("Price", "75");
		prod3Map.put("Stock", "200");
		prod3Map.put("Suppliers", "KitchenWorld");
		prod3Map.put("Warrenty", "6 Months");
		prod3Map.put("Rating", "4.2");
		prod3Map.put("Manfacturing Date", "20/3/2023");
		prod3Map.put("Expiry Date", "20/3/2024");
		System.out.println("Product 3 details :" + prod3Map);
		
		
		List<Map<String, String>> productList = new ArrayList<Map<String, String>>();
		
		productList.add(prod1Map);
		productList.add(prod2Map);
		productList.add(prod3Map);
		
		
		Map<String, List<Map<String, String>>> data = new HashMap<String, List<Map<String, String>>>();
		data.put("StudentData", studentList);
		data.put("EmployeeData", employeeList);
		data.put("ProductData", productList);
		
		System.out.println(data);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
