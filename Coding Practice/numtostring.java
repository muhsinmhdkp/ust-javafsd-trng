import java.util.Scanner;
import java.util.*;

public class numtostring {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[] = new int[4];
		for(int i=0;i<4;i++) {
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<4;j++) {
			char c = (char) arr[j];
			System.out.println(arr[j]+"-"+c);
		}
	}
}

