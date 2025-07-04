/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;
import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

	public static void main(String[] args) {
		// Create Freshman and Senior objects with name, age, and credits
		Freshman std1 = new Freshman("James", (short)20, 12);
		Senior std2 = new Senior("John", (short)30, 90);

		// Use Scanner to set GPA from user input
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter GPA for Freshman: ");
		double gpa1 = scanner.nextDouble();
		std1.setGpa(gpa1);

		System.out.print("Enter GPA for Senior: ");
		double gpa2 = scanner.nextDouble();
		std2.setGpa(gpa2);

		// Optionally set addresses (demonstrating abstract method implementation)
		std1.setAddress("123 College St");
		std2.setAddress("456 University Ave");

		// Print out the student details
		System.out.println("\nStudent Information:");
		System.out.println(std1);
		System.out.println(std2);

		scanner.close();
	}
}
