package com.cts.creatio.crm.language.basic;

public class Assignment17 {

	public static void main(String[] args) {

		// Diamond pattern

		int n = 5;

		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}

			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}