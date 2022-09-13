package sba;

import java.util.Scanner;

interface Employee1{
	int hra = 10000;
	int ta = 4000;
	 int calculateSalary(int basicpay);
	 void fetchdepartment();
}

class Engineer1 implements Employee1{
	public int calculateSalary(int basicpay) {
		return basicpay + hra +ta;
	}
	
	public void fetchdepartment() {
		System.out.println("Engineer");
	}
}

class Doctor1 implements Employee1{
	public int calculateSalary(int basicpay) {
		return basicpay + hra +ta;
	}
	
	public void fetchdepartment() {
		System.out.println("Doctor");
	}
}
public class Interface {
public static void main(String args[]) {
		
		Engineer1 e = new Engineer1();
		Doctor1 d =new Doctor1();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose D if you are a doctor and E if Engineer");
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
