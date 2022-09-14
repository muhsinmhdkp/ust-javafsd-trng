package enumer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParcerDemo3 {
	public static void main (String args[]) {
		DateTimeFormatter formattter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String date= "14/10/2020";
		LocalDate localdate = LocalDate.parse(date,formattter);
		
		System.out.println("Parced local date: "+  localdate);
		System.out.println("formatted local date :" +formattter.format(localdate));
	}
}
