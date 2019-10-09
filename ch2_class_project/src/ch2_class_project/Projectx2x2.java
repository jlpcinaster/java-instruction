package ch2_class_project;

import java.util.Scanner;

public class Projectx2x2 {

	public static void main(String[] args) {

		System.out.println("Welcome to the Letter Grade Converter");
		int  Gvalue ;
		
		System.out.println("Enter Numerical Grade: ");
		Scanner Gvalue = new Scanner (System.in);
		

		
		if (letgr >= 88 && letgr <= 100) {
			System.out.println("Letter Grade: A");				
	}
		if (letgr >= 80 && letgr <= 87) {
			System.out.println("Letter Grade: B");				
	}
		if (letgr >= 67 && letgr <= 79) {
			System.out.println("Letter Grade: C");				
	}
		if (letgr >= 60 && letgr <= 66) {
			System.out.println("Letter Grade: D");				
	}
		if (letgr >= 0 && letgr <= 60) {
			System.out.println("Letter Grade: A");				
	}
		if (letgr >= 100 && letgr <= 0) {
			System.out.println("I'm afraid that's not a Grade Value, please try again");				
	}

		System.out.println("Continue?");
		Scanner cont = new Scanner(System.in);
		String answer=cont.next();

		if(answer.equals("Y") || answer.equals("y")){
		  mathgradecalculation.Grademath();
}
