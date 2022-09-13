package sba;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Employee2{
	
	String name;
	int eID;
	static Scanner in = new Scanner(System.in);
	 void addData(int i) {
		System.out.println("Enter name :");
		this.name = in.next();
		System.out.println("Enter Employee ID: ");
		this.eID = in.nextInt();
			
	 }
	 void display(int count) {
		 System.out.println(count+ "."+"\t Name: "+this.name);
		 System.out.println("\tEmployee ID : "+this.eID);
	 }
}
public class GenericQ3 extends Employee2 {
	public static void main(String[] args) {

		
		int count = 0;
		List<Employee2> list1 = new ArrayList<>();
		System.out.print("Enter the number of Employees: ");
		int n = in.nextInt();
		
		Employee2 e[] = new Employee2[n+1];
		for(int i = 1; i<=n; i++)
		{
			e[i] = new Employee2();
			e[i].addData(i);
			list1.add(e[i]);
		}
		
		Iterator<Employee2> itr = list1.iterator();
		while(itr.hasNext())
		{
			count++;
			itr.next().display(count);
		}
	}
}
