package sba;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class week3 {
	public static void main (String args[]) throws Exception {
		
		JSONParser p2 = new JSONParser();
		HSSFWorkbook workbook =new  HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("test");
		
		//---------------HEADER WRITING-----------------------------------------------------------------------
		HSSFRow rowh = sheet.createRow(0);
		rowh.createCell(0).setCellValue("ID");
		rowh.createCell(1).setCellValue("Name");
		rowh.createCell(2).setCellValue("Email");
		rowh.createCell(3).setCellValue("Password");
		rowh.createCell(4).setCellValue("About");
		rowh.createCell(5).setCellValue("Token");
		rowh.createCell(6).setCellValue("Country");
		rowh.createCell(7).setCellValue("Location");
		rowh.createCell(8).setCellValue("Lng");
		rowh.createCell(9).setCellValue("Lat");
		rowh.createCell(10).setCellValue("Dob");
		rowh.createCell(11).setCellValue("Gender");
		//----------------------------------------------------------------------------------------------------
		
		
		OutputStream out = new FileOutputStream("C:\\Users\\ustjavafsdb203\\Downloads\\test.xls");
		
		
		try {
			
			JSONArray arr = (JSONArray)p2.parse(new FileReader("C:\\Users\\ustjavafsdb203\\Downloads\\EmployeeData.json"));
			
			for (int j=1;j<=(arr.size()+1);j++) {
				
			for (int i=0; i<arr.size();i++) {
				
				JSONObject obj = (JSONObject) arr.get(i);
				
				long id = (long) obj.get("id");
				
				String name = (String) obj.get("name");
				name = name.toUpperCase();
				
				String email = (String) obj.get("email");
				
				String password = (String) obj.get("password");
				
				String about = (String) obj.get("about");
				
				String token = (String) obj.get("token");
				
				String country = (String) obj.get("country");
				
				String location = (String) obj.get("location");
				
				long lng = (long) obj.get("lng");
				
				long lat = (long) obj.get("lat");
				
				String dob = (String) obj.get("dob");
				
				long gender = (long) obj.get("gender");
				
					HSSFRow rowh1 = sheet.createRow(i+1); // Creating cells to add the read values
					
					rowh1.createCell(0).setCellValue(id);
					rowh1.createCell(1).setCellValue(name);
					rowh1.createCell(2).setCellValue(email);
					rowh1.createCell(3).setCellValue(password);
					rowh1.createCell(4).setCellValue(about);
					rowh1.createCell(5).setCellValue(token);
					rowh1.createCell(6).setCellValue(country);
					rowh1.createCell(7).setCellValue(location);
					rowh1.createCell(8).setCellValue(lng);
					rowh1.createCell(9).setCellValue(lat);
					rowh1.createCell(10).setCellValue(dob);
					rowh1.createCell(11).setCellValue(gender);
			

				
				}
			
				workbook.write(out); // Writing the accessed to the Xls file
				
			}
			System.out.println("Data is Written Successfully");
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}




/*JSONObject obj = (JSONObject)o;
long id = (long) o.get("id");
System.out.println(id);
JSONArray id = (JSONArray) obj.get("id");
Iterator<String> iterator = id.iterator();
while (iterator.hasNext()) {
	System.out.println("ID = " +iterator.next());
Iterator itr = arr.iterator();
JSONObject obj = (JSONObject)itr.next();
while(itr.hasNext()) {
File f = new File("C:\\Users\\ustjavafsdb203\\Downloads\\test.xls");
GeericExcelGenerator gl = new GeericExcelGenerator("Downloads",workbook);	
}*/




/* ----------------PRINTING---------------------
System.out.println(id);
System.out.println(name);
System.out.println(email);
System.out.println(password);
System.out.println(about);
System.out.println(token);
System.out.println(country);
System.out.println(location);
System.out.println(lng);
System.out.println(lat);
System.out.println(dob);
System.out.println(gender);
*/




