package com.cts.creatio.crm.language.basic;

public class Assignment2 {

	public static void main(String[] args) {
		//array of status and marks, subject and semester
		String [][][] data= new String[6][7][6];
		
		//Semesters as the first dimension
				data[0][0][0]="Semester";
				data[1][0][0]="Sem 1";
                data[2][0][0]="Sem 2";
                data[3][0][0]="Sem 3";
                data[4][0][0]="Sem 4";
                data[5][0][0]="Sem 5";

				
		//Subjects and Status/Marks as the second dimension.
				data[0][1][0]="Subject1";
				data[0][2][0]="Subject2";
				data[0][3][0]="Subject3";
				data[0][4][0]="Subject4";
				data[0][5][0]="Subject5";
				data[0][6][0]="Subject6";
		
		//Actual values for Subject Names and Marks as the third dimension.
				data[0][0][1]="Status(Marks)";
                data[0][0][2]="Status(Marks)";
                data[0][0][3]="Status(Marks)";
                data[0][0][4]="Status(Marks)";
                data[0][0][5]="Status(Marks)";
                
              //Subjects of first row
                data[1][1][0]="Mathematics I";
                data[2][1][0]="Mathematics II";
                data[3][1][0]="Data Structure";
                data[4][1][0]="Algorithms";
                data[5][1][0]="Probability & Stats";
        
                //Subjects of second row
                data[1][2][0]="Physics";
                data[2][2][0]="Mechanics";
                data[3][2][0]="Discrete Mathematics";
                data[4][2][0]="Computer Networks";
                data[5][2][0]="Machine Learning";
                
                //Subjects of Third row
                data[1][3][0]="Chemistry";
                data[2][3][0]="Environmental Sci";
                data[3][3][0]="Digital Electronics";
                data[4][3][0]="Database Systems";
                data[5][3][0]="Compiler Design";
                
                //Subjects of Fourth row
                data[1][4][0]="Computer Programming";
                data[2][4][0]="Basic Electronics";
                data[3][4][0]="Operating System";
                data[4][4][0]="Microprocessors";
                data[5][4][0]="Theory of Computation";
                
                
                //Subjects of Fifth row
                data[1][5][0]="Engineering Drawing";
                data[2][5][0]="Engineering Physics";
                data[3][5][0]="Signals and Systems";
                data[4][5][0]="Communication Eng";
                data[5][5][0]="Embedded Systems";
                
              //Subjects of Sixth row
                data[1][6][0]="Basic Electrical Eng.";
                data[2][6][0]="Engineering Graphics";
                data[3][6][0]="Object-Oriented Prog.";
                data[4][6][0]="Software Engineering";
                data[5][6][0]="Computer Graphics";
                
                //Status(Marks) of first row
                data[1][1][1]="Pass(78)";
                data[2][1][2]="Pass(82)";
                data[3][1][3]="Pass(88)";
                data[4][1][4]="Pass(91)";
                data[5][1][5]="Pass(86)";
                
              //Status(Marks) of Second row
                data[1][2][1]="Pass(85)"; 
                data[2][2][2]="Pass(77)"; 
                data[3][2][3]="Pass(81)"; 
                data[4][2][4]="Pass(73)"; 
                data[5][2][5]="Pass(88)"; 
                
                //Status(Marks) of Third row
                data[1][3][1]="Fail(21)"; 
                data[2][3][2]="Pass(93)"; 
                data[3][3][3]="Pass(76)"; 
                data[4][3][4]="Fail(19)"; 
                data[5][3][5]="Pass(84)";
                
                //Status(Marks) of Fourth row
                data[1][4][1]="Pass(74)"; 
                data[2][4][2]="Fail(19)"; 
                data[3][4][3]="Fail(32)"; 
                data[4][4][4]="Pass(80)"; 
                data[5][4][5]="Pass(95)";
                
                //Status(Marks) of Fifth row
                data[1][5][1]="Pass(88)"; 
                data[2][5][2]="Fail(24)"; 
                data[3][5][3]="Pass(85)"; 
                data[4][5][4]="Pass(76)"; 
                data[5][5][5]="Pass(73)";
                
                //Status(Marks) of Sixth row
                data[1][6][1]="Pass(79)"; 
                data[2][6][2]="Pass(90)"; 
                data[3][6][3]="Pass(78)"; 
                data[4][6][4]="Pass(87)"; 
                data[5][6][5]="Pass(90)";
//Print Semester 2 Subject 4 and Subject 5 names.                
                System.out.println("Semester 2 Subject 4 and Subject 5 names are: "+data[2][4][0]+" and "+data[2][5][0]);
                
//Print the Status/Marks of Semester 4 Subject 3 and Subject 6.
                
                System.out.println("Status/Marks of Semester 4 Subject 3 and Subject 6 are: "+data[2][4][2] +" and "+data[4][5][4]);
	}

}
