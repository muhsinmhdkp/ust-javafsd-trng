package exeptions;

public class Exception1 {
public static void main(String args[]) {
	int a [] = {1,2,3,4,5};
	try {
	System.out.println(a[5]);
	}
	catch (Exception e)
	{
		System.out.println(e);
	}
}
}
