package com.ust;

class Overflow {
	
	public static void main(String args[]) {
		byte a =126;
		System.out.println(a);
		
		a++;
		System.out.println(a); //overflow
		
		a++;
		System.out.println(a);
		
		a++;
		System.out.println(a);
	}

}
