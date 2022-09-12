package exeptions;

public class Exception3 {
	public double calculator(int a , int b) throws Exception 
	{	
		//throw new Exception("abc");
		return (a+b);
	}
	
	void display(int b)throws Exception
	{
		if (b==5) throw new Exception(); 
		else 
			System.out.println("n");
		
	}
	public static void main(String args[]) {
		Exception3 s = new Exception3();
		try {
			s.calculator(5, 6);
			s.display(5);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
