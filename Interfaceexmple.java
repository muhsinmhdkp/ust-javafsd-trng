package set4;
interface Vehicle{
	String getColour();
	String getEnginetype();
	int x= 4;
}
public class Interfaceexmple implements Vehicle {
	
	public String getColour() {
		return "Green";
	}
	
	public String getEnginetype() {
		return "Manual";
	}
}
