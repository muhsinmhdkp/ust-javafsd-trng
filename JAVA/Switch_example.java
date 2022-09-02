package com.ust;

public class Switch_example {
	public static void main(String args[]) {
		String str = "green";
		switch(str) {
		case "red":
			System.out.println("is in red");
			System.out.println("*");
			break;
			
		case "green":
			System.out.println("is in Green");
			System.out.println("*");
			break;
			
		case "Orange":
			System.out.println("is in Orange");
			System.out.println("*");
			break;
			
		default :
			System.out.println("invalid outout");
		}
		
	}

}
