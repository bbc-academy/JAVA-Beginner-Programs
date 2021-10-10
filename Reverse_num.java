//WAP to reverse any number.
import java.util.Scanner;
public class Reverse_num {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num=sc.nextInt(); //num=123
        int temp=num, rem=0, rev=0;

        while(num!=0)
        {
            rem = num % 10; // 1 % 10 = 1
            rev = rev * 10 + rem; // rev=321
            num = num / 10; // num = 0
        }
        System.out.println("The reverse of "+temp+" is : "+rev);
    }
}
