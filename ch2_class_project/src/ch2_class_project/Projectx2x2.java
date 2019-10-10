package ch2_class_project;

import java.util.Scanner;

public class Projectx2x2 {

	public static void main(String[] args) {

		System.out.println("Welcome to the Letter Grade Converter");
		System.out.println();
		@SuppressWarnings("resource")
		Scanner choice = new Scanner(System.in);
		String moreGrades = "y";
		while (moreGrades.equalsIgnoreCase("y")) {

			System.out.println("Enter Numerical Grade: ");
			@SuppressWarnings("resource")
			Scanner Grade = new Scanner(System.in);

			int Gvalue;
			String letgr = null;
			Gvalue = Grade.nextInt();

			if (Gvalue >= 88 && Gvalue <= 100)
				letgr = "A";

			else if (Gvalue >= 80 && Gvalue <= 87)
				letgr = "B";

			else if (Gvalue >= 67 && Gvalue <= 79)
				letgr = "C";

			else if (Gvalue >= 60 && Gvalue <= 66)
				letgr = "D";

			else if (Gvalue >= 0 && Gvalue <= 60)
				letgr = "F";

			else if (Gvalue >= 100 && Gvalue <= 0)
				letgr = "I'm afraid that's not valid Grade Value, please try again";

			System.out.println("Letter Grade: " + letgr);

			System.out.println("Continue? y/n");
			moreGrades = choice.next();
			choice.next();
		}
		System.out.println("Bye!");

	}
}
