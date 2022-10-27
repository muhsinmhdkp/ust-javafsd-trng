import java.io.*;
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        String str1,str2=" ";
        char ch,ch1;
        int index=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
         str1=sc.nextLine();
         System.out.println(str1);
         System.out.println("Enter char to be replaced");
         ch=sc.next().charAt(0);
         System.out.println("Enter replacing letter");
         ch1=sc.next().charAt(0);
         for(int i=0;i<str1.length();i++){
             if(str1.charAt(i)==ch){
                 index=i;
                 str2=str1.substring(0,index)+ch1+str1.substring(index+1);
                 
                 str1=str2;
             }
             
         }
        
          System.out.println("new String"+str2);
    }
    
}