package exeptions;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_example {
	public static void main (String ags[]) {
		File f = new File ("C:\\Users\\ustjavafsdb203\\abc.txt");
		try 
		{
			FileOutputStream fstm = new FileOutputStream(f);
			byte[] b = "This iam writing to file".getBytes();
			if(f.createNewFile())
			{
				System.out.println("New file created");
			}
			else
			{
				System.out.println("file exist");
				fstm.write(b);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
}
