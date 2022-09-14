package enumer;
enum  Enum4 {
	SMALL,MEDIUM,LARGE,EXTRALARGE;
	
	public String getSize() {
		switch (this) {
		case SMALL:
			return "small";
			
		case MEDIUM:
			return "medium";
			
		case LARGE:
			return "Large";
			
		default:
			return null;
		}
	}
	
	public static void main(String args[]) {
		System.out.println("The size of the pizza is: " + Enum4.SMALL.getSize());
	}
}
