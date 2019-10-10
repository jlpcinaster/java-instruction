package ch2_class_project;

import java.util.Scanner;

class Projectx2x3 {

	static void Rectangle() {

		System.out.println("Welcome to the Area and Perimeter Calculator");

		@SuppressWarnings("resource")
		Scanner Lvalue = new Scanner(System.in);
		System.out.println("Enter Length: ");
		double Length = Lvalue.nextDouble();

		@SuppressWarnings("resource")
		Scanner Wvalue = new Scanner(System.in);
		System.out.println("Enter width: ");
		double Width = Wvalue.nextDouble();

		double resultA = Length * Width;
		double resultP = (Length + Width) * 2;

		System.out.println("Area: " + resultA);
		System.out.println("Perimeter: " + resultP);

		System.out.println("Continue? y/n");
		@SuppressWarnings("resource")
		Scanner cont = new Scanner(System.in);
		String anwser = cont.next();

		if (anwser.equalsIgnoreCase("y")) {
			Projectx2x3.Rectangle();
		}
	}
}

class Main {
	public static void main(String[] args) {
		Projectx2x3.Rectangle();
	}
}
