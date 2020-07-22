package com.epam.IntrestCalculation;

import java.io.*;
import java.util.Scanner;

public class SI_CI {
	public static void si_ci_calculation() {
		PrintStream print = new PrintStream(new FileOutputStream(FileDescriptor.out));
		Scanner scan = new Scanner(System.in);
		try {
			print.println("Enter Principle amount: ");
			double principalAmount = scan.nextDouble();
			print.println("Enter rate of Interest: ");
			double interestRate = scan.nextDouble();
			print.println("Enter Time period: ");
			double time = scan.nextDouble();
			print.println("Simple Interest : " + ((principalAmount * time * interestRate) / 100));
			print.println("Compound Interest : " + ((principalAmount * Math.pow(1 + (interestRate / 100), time)) - principalAmount));
		} catch (Exception e) {
			print.println("Invalid Input");
		}
		scan.close();
	}

}
