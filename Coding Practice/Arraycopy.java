import java.util.*;

public class Arraycopy{

	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int N = scn.nextInt();
		System.out.println("Enter the String values to enter");
		String[] arr =new String[N];
		String[] arrcpy = new String[N];
		for (int i=0; i<N; i++){
			arr[i] = scn.next();
		}
		for (int i=0; i<N; i++){
			arrcpy[i] = arr[i];
		}
		System.out.println("The array is: " + Arrays.toString(arr));
		System.out.println("The copy :" + Arrays.toString(arrcpy));
	}
}
		