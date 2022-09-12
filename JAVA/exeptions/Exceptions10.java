package exeptions;

import java.io.BufferedReader;
import java.io.FileReader;

import set3.BufferReader;

public class Exceptions10 {
	public static void main(String args[]) {
		char[] array = new char [100];
		
		try {
			FileReader file = new FileReader("input.txt");
			BufferedReader input = new BufferedReader(file);
			input.read(array);
			System.out.println("Data in the file:");
			
			System.out.println(array);
			
			input.close();
			
		}
		
		catch (Exception e) {
			e.getStackTrace();
		}
	}
}
