package com.ust;

public class Sumarray {
	public static void main (String args[]) {
		int[] numbers = {3,4,5,-5,0,12};
		int sum = 0;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[4]);
		System.out.println(numbers.length);
		for (int x: numbers) {
			//sum += x;
			sum = sum+x;
		}
		System.out.println("Sum=" +sum);
	}
}
