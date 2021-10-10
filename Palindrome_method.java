import java.util.Scanner;

public class Palindrome_method {

    public void Ispalindrome()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num=sc.nextInt();
        int temp=num;
        int rev=0;
        while(num!=0)
        {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        if(rev==temp)
        {
            System.out.println("Palindrome number.");
        }
        else
        {
            System.out.println("Not a Palindrome number.");
        }
    }

    public static void main(String[] args) {

        Palindrome_method pal=new Palindrome_method();
        pal.Ispalindrome(); //Function Calling

    }
}
