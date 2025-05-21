package com.cts.creatio.crm.language.basic;

public class Assignment10 {
	/***********
	 * 12 ,34,11,36,87,98,93*************** Store the values in Array and Print
	 * second and third largest number from the above values without using
	 * collections and default sort methods
	 */
	public static void main(String[] args) {

		int[] numbers = { 12, 34, 11, 36, 87, 98, 93 };

		for (int i = 0; i <= numbers.length - 1; i++) {
			for (int j = i + 1; j <= numbers.length - 1; j++) {
				if (numbers[i] < numbers[j]) {
					int a = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = a;
				}

			}

		}

		// Print second and third largest number from the above values
        System.out.println("Second largest number is : " + numbers[1]+" and "+numbers[2]);
	}

}
