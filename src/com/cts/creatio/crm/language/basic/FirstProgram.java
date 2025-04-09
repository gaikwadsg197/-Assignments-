package com.cts.creatio.crm.language.basic;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.logging.Logger;

public class FirstProgram {

	/*********
	 * Advantages of print statement
	 * 
	 * @throws FileNotFoundException
	 *********/

	// Debugging and error detection
	// Monitoring program execution
	// Testing and validation
	// Education and learning
	// Logging system

	public static void main(String[] args) throws FileNotFoundException {

		// Print the statement and go to next line
		System.out.println("Hello World!");

		// Print the statement and stay on same line
		System.out.print("Hello");
		System.out.print(" World!");

		System.out.println();
		// Print the formatted content and stay on same line
		System.out.printf("%s is completed BE, empid is %d and visa status is %b", "Sanket", 1234, true);

		System.out.println();
		// Format the digits and then print the formated content and the stay on the
		// same line
		System.out.format("Total Bill is %.2f %n ", 100.9294392);

		// % n for new line System.out.format ("Total Bill is %.2f %n",100.9294392);

		// append

		System.out.append("My name is Sanket").append(", My emp id is 5668598");

		System.out.println();

		// Print the character based on ASCII value
		System.out.write(65);
		System.out.println();

		// Print logs of program
		Logger log = Logger.getLogger("My Logger");
		log.info("Current line is 45");

		// print the errors in print statements
		System.err.println("ERROR:Expected result is not matching with actual result");

		// creating log file to print logs

		PrintWriter writer = new PrintWriter("C:\\GdriveStorage\\AutomationTraining\\AutomationProject\\Logs.txt");
		writer.println(LocalDateTime.now() + "Current line is 57");
		writer.println(LocalDateTime.now() + "Current line is 58");
		writer.println(LocalDateTime.now() + "Execution is completed");
		writer.close();
	}

}
