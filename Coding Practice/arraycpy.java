import java.util.*;
import java.util.Scanner;
import java.lang.*;
class HelloWorld {
    public static void main(String[] args) {
        int A[]={1,2,3};
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int B[]=new int[n];
        for(int i=0;i<n;i++){
            B[i]=A[i];
            System.out.println(B[i]);
        }
        
    }
}