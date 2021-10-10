//WAP to check a palindrome number.
import java.util.Scanner;
public class Palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num=sc.nextInt(); //num=123
        int temp=num, rev=0;

        while(num!=0)
        {
            int rem = num % 10; // 1 % 10 = 1
            rev = rev * 10 + rem; // rev=321
            num = num / 10; // num = 0
        }

        if(temp==rev)
        {
            System.out.println("It's a Palindrome Number");
        }
        else
        {
            System.out.println("It's not a Palindrome Number.");
        }
    }
}
