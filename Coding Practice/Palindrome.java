import java.util.*;

public class Largest {
	int[] arr = {1,5,4,65,33,2,3,6};
	int lar = arr[0];
	public static void main(String args[]){
		for (int i=0; i<arr.length(); i++){
			if(arr[i]>lar){
			lar=arr[i];
			}
		}
		System.out.println(lar);
	}
}
			
		