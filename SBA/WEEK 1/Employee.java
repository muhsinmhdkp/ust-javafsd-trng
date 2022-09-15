package com.ust;
import java.util.Scanner;

class Details {
	
	int uid;
	String name;
	long number;
	String email;
	String designation;
	String worklocation;
	float salary;
	static Scanner input = new Scanner(System.in);
	
	void adddata() {
		
		System.out.print("UID: ");
		this.uid = input.nextInt();
		System.out.print("NAME: ");
		this.name = input.next();
		System.out.print("NUMBER: ");
		this.number = input.nextLong();
		System.out.print("EMAIL: ");
		this.email = input.next();
		System.out.print("WORK LOCATION: ");
		this.worklocation = input.next();
//		System.out.print("SALARY: ");
//		this.salary = input.nextInt();
		
	}
	

	void salary(int x) {
		this.salary = x;
		System.out.println("salary method woth parameter:int");
	}
	
	void salary(float x) {
		this.salary = x;
		System.out.println("salary method with parameter:float");
		
	}
	
	void display() {
		System.out.println("UID :" +this.uid);
		System.out.println("NAME :" +this.name);
		System.out.println("NUMBER :" +this.number);
		System.out.println("EMAIL :" +this.email);
		System.out.println("WORKLOCATION :" +this.worklocation);
		System.out.println("SALARY :"+this.salary);
	}

}
class Engineer extends Details{
	
	void salary(float x) {
		super.salary(x);;
		this.salary = x;
		System.out.println("salary method with parameter:float Engineer class"
				+ "");
		
	}
}

public class Employee extends Engineer{
	public static void main(String args[]) {
		Engineer a = new Engineer();
		
		System.out.println("enter salary: ");
		float y = input.nextFloat();
		a.adddata();
		a.salary(y);
		a.display();
	}
}
