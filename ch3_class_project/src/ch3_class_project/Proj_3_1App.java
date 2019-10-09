package ch3_class_project;

import java.util.Scanner;

public class Proj_3_1App {

	public static void main(String[] args) {

//		Scanner choice = new Scanner(System.in);

		System.out.println("Welcome to the Temperature Converter.");
		System.out.println();
		@SuppressWarnings("resource")
		Scanner contDeg = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			double fTemp;
			@SuppressWarnings("resource")
			Scanner fValue = new Scanner(System.in);
			System.out.println("Enter degrees in Fahrenheit: ");
			fTemp = fValue.nextDouble();

			fTemp -= 32;
			double a1 = 5;
			a1 /= 9;
			double cCont = fTemp * a1;
			double cTemp = Math.round(cCont);
			System.out.println("Degrees in Celsius: " + cTemp);

//		Scanner choice = new Scanner(System.in) ;
//		contDeg = choice.next();
//		System.out.println("Continue? y/n") ;

			System.out.println("Continue? y/n");
			choice = contDeg.next();
			System.out.println();

		}

	}

}

// System.out.println("Bye!") ;

//while(contDeg.equalsIgnoreCase("y")) {
//System.out.println("Continue? y/n") ;
//contDeg = choice.next();
//choice.next() ;
//
//}
//System.out.println("Bye!") ;
