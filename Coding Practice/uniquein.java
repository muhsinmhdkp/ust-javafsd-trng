import java.util.*;
import java.util.Scanner;
public class A{
public static void main(String args[]){
    int j,i;
   
    //Scanner sc=new Scanner(System.in);
    //System.out.println("Enter String: ");
    String a="malayalam";
    for(i=0;i<a.length();i++){
       int f=0;
        for( j=0;j<a.length();j++){
            if(a.charAt(i)==a.charAt(j)){
                f++;
            }
        }
        
        if(f==1){
       System.out.println(a.charAt(i));}
    }
    
}
}