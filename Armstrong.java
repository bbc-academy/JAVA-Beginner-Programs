//wap to check armstrong number.
import java.util.Scanner;
public class Armstrong {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num=sc.nextInt(); //num=153
        int temp=num, arm=0;

        while(num!=0) //0!=0[F]
        {
            int rem = num % 10; // 1 % 10 = 1
            arm = arm + rem*rem*rem; // 152+1*1*1 = 153
            num = num / 10; // num = 1/10 = 0
        }

        if(temp==arm)
        {
            System.out.println("It's an Armstrong Number");
        }
        else
        {
            System.out.println("It's not an Armstrong Number.");
        }
    }
}
