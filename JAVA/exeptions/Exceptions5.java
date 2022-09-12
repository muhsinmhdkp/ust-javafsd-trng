package exeptions;

import java.io.File;

public class Exceptions5 {
	public static void main (String args[])
	{
		File file = new File("file.txt");
		boolean value = file.delete();
		
		if (value) {
			System.out.println("The file is deleted");
		}
		else {
			System.out.println("The file is not deleted");
		}
		
	}
}
