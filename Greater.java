//Program to find greater number between 2 numbers.
import java.util.Scanner;
public class Greater {
    public void greater(int num1, int num2)
    {
        if(num1>num2)
        {
            System.out.println(num1+" is greater.");
        }
        else
        {
            System.out.println(num2+" is greater.");
        }
    }
    public static void main(String[] args) {
        Greater great=new Greater();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any 2 numbers : ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        great.greater(num1,num2);
    }
}