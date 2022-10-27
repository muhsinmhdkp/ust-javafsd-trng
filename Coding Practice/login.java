import java.util.Scanner;
public class loginq_alt {
	public static void main(String[] args) {
		System.out.println("Enter your ID");
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		int len = s.length();
		if (len==12) {
			String f3 = s.substring(0, 3);
			String f57 = s.substring(4, 7);
			String f712 = s.substring(8, 11);
			String s1 = s.substring(3,4);
			String s2 = s.substring(7,8);
			if ("GBL".equals(f3) && "/".equals(s1) && "/".equals(s2)) {
				try {
					int try1 = Integer.parseInt(f57);
						System.out.println("Login Success");
					}catch(Exception e) {
						System.out.println("Incorrect Format");
					}
			}
			else
				System.out.println("Incorrect Format 1");
			}
		else
			System.out.println("Invalid Input");
			}
}