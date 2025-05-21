package com.cts.creatio.crm.language.basic;

import java.util.HashMap;
import java.util.Map;

public class Assignment9 {
	
	/*********There are 5 Employee records. Calculate the Hike percentage of each Employee and store the
Values in Map with EmployeeName and HikePercentagevalue and Print them********/

	public static void main(String[] args) {
		String[] empname = {"Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green"};
		
		Double [] emp1= {75000.0, 5.1, 4.2};
		Double [] emp2= {68000.0, 3.3, 3.8};
		Double [] emp3= {82000.0, 7.1, 4.5};
		Double [] emp4= {90000.0, 10.2, 2.5};
		Double [] emp5= {60000.0, 2.4, 3.5};
		

        Map<String, Double[]> empData = new HashMap<>();
        empData.put(empname[0], emp1);
        empData.put(empname[1], emp2);
        empData.put(empname[2], emp3);
        empData.put(empname[3], emp4);
        empData.put(empname[4], emp5);
		
		
		//hike percentage
        Map<String, Double> hike = new HashMap<>();
		
        for (String emp:empname)
        {
        	Double []data=empData.get(emp);
        	
        	double salary=data[0];
            double experience = data[1];
            double rating = data[2];
            
            
            double variable;
            double bonus;
            double reward = 0;
            
            
                 if (rating >= 4) {
                    variable = 15;
                    bonus = 1500;
                } else if (rating >= 3) {
                    variable = 10;
                    bonus = 1200;
                } else {
                    variable = 3;
                    bonus = 300;
            }
                if (experience>5)
                {
                	reward = 5000;
                }
                
                double hike1 = (salary * variable / 100) + bonus + reward;
                double hikePercentage = (hike1 / salary) * 100;
                hike.put(emp, hikePercentage);
            }

            // Print hike details
            System.out.println("Employee Hike Details:");
            System.out.println(hike);
        }

    }
		

