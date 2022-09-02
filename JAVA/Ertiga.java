package com.ust;

class Car{
	String model;
	String colour;
	int wheels; 
	int seats;
	String geartype;
	
	void display() {
		System.out.print("In Car class");
	}
}

class Ciaz extends Car {
	void display() {
		System.out.print("In Ciaz class");
	}
	
	void show() {
		System.out.print("In show method");
	}
}

public class Ertiga extends Car {
	void display() {
		System.out.print("In Ertiga class");
		super.display();
	}
	
	public static void main (String args[]) {
		Ciaz c = new Ciaz();
		c.display();
		c.show();
		Ertiga e = new Ertiga();
		e.display();
		System.out.print(e.colour);
	}
}
