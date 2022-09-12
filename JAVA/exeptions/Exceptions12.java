package exeptions;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Exceptions12 {
	public static void main(String args[]) {
		try {
			FileInputStream file = new FileInputStream("input.txt");
			
			BufferedInputStream input = new BufferedInputStream(file);
			int i = input.read();
			
			while (i!= -1) {
				System.out.println((char)i);
				i = input.read();
			}
			input.close();
		}
		catch (Exception e ) {
			e.getStackTrace();
		}
	}
}
