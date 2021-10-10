//wap to check prime number without break statement
import java.util.Scanner;
public class Prime1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num=sc.nextInt();
        int count=0;

        for(int i=1 ; i<=num ; i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println(num+" is a Prime Number.");
        }
        else
        {
            System.out.println(num+" is not a Prime Number.");
        }
    }
}