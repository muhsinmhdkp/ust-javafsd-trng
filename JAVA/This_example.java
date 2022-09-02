package com.ust;

public class This_example {
	
	static int x = 1;
	private int y = 3;
	public void method1(int x)
	{
		This_example t =  new This_example();
		this.x =2;
		this.x =3;
		this.y = 5;
		
		y=4;
		
		System.out.println("Test.x:" + This_example.x);
		System.out.println("t.x:" + This_example.x);
		System.out.println("t.y:" + t.y);
		System.out.println("y:" + y);
	}
	
	public static void main(String args[]) {
		This_example t = new This_example();
		t.method1(5);
	}

}
