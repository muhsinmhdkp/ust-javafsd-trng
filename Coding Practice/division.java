import java.util.Scanner;

public class Division {
    public String divideTwoNumbers(int number1, int number2)
    {
        int value =0 ;
        String res = "";
       
        try
        {
            value= number1/number2;
            res = ("The answer is "+ value);
        }
        catch(ArithmeticException e)
        {
            res = "Division by zero is not possible";
        }
        finally
        {
            return(res+". Thanks for using the application.");    
        }
    }
   
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num1 =  sc.nextInt();
        int num2 =  sc.nextInt();
        Division div = new Division();
        System.out.print(div.divideTwoNumbers(num1,num2));
    }
}