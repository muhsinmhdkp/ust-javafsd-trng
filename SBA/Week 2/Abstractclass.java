package sba;

import java.util.Scanner;

abstract class Employee{
	int hra = 10000;
	int ta = 3000;
	abstract int calculateSalary(int basicpay);
	abstract void fetchdepartment();
}

class Engineer extends Employee{
	public int calculateSalary(int basicpay) {
		return basicpay + hra +ta;
	}
	
	public void fetchdepartment() {
		System.out.println("Engineer");
	}
}

class Doctor extends Employee{
	public int calculateSalary(int basicpay) {
		return basicpay + hra +ta;
	}
	
	public void fetchdepartment() {
		System.out.println("Doctor");
	}
}

public class Abstractclass {
	public static void main(String args[]) {
		
		Engineer e = new Engineer();
		Doctor d =new Doctor();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose D if you are a doctor and Y if Engineer");
		char i = sc.next().charAt(0);
		if (i==('D'|'d')) {
			System.out.println("Enter the salary: ");
			int basicpay = sc.nextInt();
			d.fetchdepartment();
			System.out.println("The salary = " +d.calculateSalary(basicpay));
		}
		else if(i==('E'|'e')) {
			System.out.println("Enter the salary: ");
			int basicpay = sc.nextInt();
			e.fetchdepartment();
			System.out.println("The salary = " +e.calculateSalary(basicpay));
		}
		else {
			System.out.println("invalid input");
		}
		
		
	}
}
