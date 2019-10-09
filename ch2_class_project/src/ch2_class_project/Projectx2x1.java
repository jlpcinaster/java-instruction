package ch2_class_project;

import java.util.Scanner;

public class Projectx2x1 {

	public static void main(String[] args) {
		String fName;
		String lName;
		String DOB;

		System.out.println("Student Registration Form");
		
		Scanner fNamevalue = new Scanner (System.in);
		System.out.println("Enter first name: ");
		fName = fNamevalue.next();
		
		Scanner lNamevalue = new Scanner (System.in);
		System.out.println("Enter last name: ");
		lName = lNamevalue.next();
		
		Scanner DOBvalue = new Scanner (System.in);
		System.out.println("Enter year of birthname: ");
		DOB = DOBvalue.next() ;
		
		System.out.println("Welcome " + fName + " " + lName + "!");
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is:" + fName + "*" + DOB);


		
	}

}
