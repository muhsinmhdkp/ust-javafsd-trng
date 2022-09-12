package exeptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class File_buffered {
	public static void main (String args[]) {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		try
		{
		System.out.println("Enter age:");
		String age = br.readLine();
		System.out.println(age);
		}
		
		
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
