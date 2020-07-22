package com.epam.IntrestCalculation;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Construction {
	public static void constructionCost() {
		PrintStream p = new PrintStream(new FileOutputStream(FileDescriptor.out));
		Scanner sc = new Scanner(System.in);
		p.printf("Select the material type");
		p.println("1.Standard Material");
		p.println("2.Above Standard Material");
		p.println("3.High Standard Material");
		p.println("4.High Standard Material and Fully Automated home");
		try {
			int type = sc.nextInt();
			double houseArea, totalCost = -1;
			p.println("Enter area of the house..");
			houseArea = sc.nextDouble();
			sc.close();
			switch (type) {
			case 1:
				totalCost = 1200 * houseArea;
				break;
			case 2:
				totalCost = 1500 * houseArea;
				break;				
			case 3:
				totalCost = 1800 * houseArea;
				break;
			case 4:
				totalCost = 2500 * houseArea;
				break;
			default:
				p.println("Select type from 1-4");
			}
			
		} catch (Exception e) {
			p.printf("Invalid Input");
		}
	}
}
