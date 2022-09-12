package exeptions;

import java.io.File;

public class Exceptions6 {
	public static void main (String args[])
	{
		File file = new File("C:\\Users\\ustjavafsdb203");
		
		String [] fileList = file.list();
		for (String str : fileList) {
			System.out.println(str);
		}
}
}
