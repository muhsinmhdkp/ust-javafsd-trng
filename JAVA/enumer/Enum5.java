package enumer;



public class Enum5 {
	enum Position {
		Reema ("Panda"), Himanshu("Bharadwaj"), Geetanjali("Sharma");
		
		String IName;
		
		Position (String s){
		IName = s;
		}
		
		String showPostion() {
			return IName;
		}
	}
	
	public static void main (String args[]) {
		for (Position pos: Position.values()) {
			int val = pos.ordinal()+1;
			System.out.println("first name = "+ pos+ "\nLastname = "+pos.showPostion()+"\n position in class= "+val);
		}
	}

}
