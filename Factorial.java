//WAP to find factorial of any number.
import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num=sc.nextInt(); // num=5
        int temp=num;
        int fact=1;
        if(num<0)
        {
            System.out.println("No factorial of negative number.");
        }
        else if(num==0)
        {
            System.out.println("The factorial of 0 is 1.");
        }
        else
        {
            while(num!=0)
            {
                fact=fact*num; // fact = 120
                num--; // num=0
            }
            System.out.println("The factorial of "+temp+" is : "+fact);
        }
    }
}
