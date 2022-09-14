package enumer;

enum Signal{
	RED(5),ORANGE(10),GREEN(15);
	private int x;
	private Signal(int x) {
		this.x=x;
		
	}
	int getIndex() {
		return x;
	}
}
public class Enum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Signal s = Signal.GREEN;
	System.out.println(s.getIndex());
	System.out.println(s.ordinal());
	System.out.println(s.name());
	System.out.println(s.valueOf("RED"));
	}

}
