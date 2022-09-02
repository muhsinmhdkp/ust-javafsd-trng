package com.ust;
import java.util.Scanner;

class Scannerfn {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter float: ");
		float myFloat = input.nextFloat();
		System.out.println("Float entered = "+ myFloat);
		
		System.out.print("Enter Double:");
		double myDouble = input.nextDouble();
		System.out.println("Double entered = "+myDouble);
		
		System.out.print("Enter Text:");
		String myString = input.next();
		System.out.println("Double entered = "+myString);
				
	}
}
