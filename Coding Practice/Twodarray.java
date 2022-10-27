import java.util.*;

public class Twodarray {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int R = scn.nextInt();
		int C = scn.nextInt();
		System.out.println("Enter the numbers to be added: ");
		int[][] arr = new int[R][C];
		int[][] temp = new int[1][C];
		
		for (int i=0; i<R; i++){
			for(int j=0; j<C; j++){
				arr[i][j] = scn.nextInt();
				}
		}

		for (int i=0; i<R; i++){
			System.out.println("\n");
			for(int j=0; j<C; j++){
				System.out.print(arr[i][j] + " ");
			}
			
		}

		for (int j=0; j<C; j++){
			temp[0][j] = arr[R-1][j];
			arr[R-1][j] = arr[0][j];
			arr[0][j] = temp[0][j];
		}
			

		
		for (int i=0; i<R; i++){
			System.out.println("\n");
			for(int j=0; j<C; j++){
				System.out.print(arr[i][j] + " ");
			}
			
		}
		}
	
}