//wap to check a Strong / Krishnamurthy / Special Number.
import java.util.Scanner;
public class Strong {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num=sc.nextInt(); // 145
        int temp=num, sum=0; //temp=145 , sum=0
        while(num!=0) //14!=0 [T]
        {
            int i=1, fact=1; // i=1, fact=1
            int rem=num%10; // rem = 14 % 10 = 4
            while(i<=rem) // 1 <= 5 [T]
            {
                fact *= i; // fact = 1
                i++; // i=1
            }
            sum+=fact; // sum = 120 + 24 + 1 => 145
            num/=10; // num = 14
        }
        if(temp==sum) // 145 is equals to 145
        {
            System.out.println(temp+" is a Strong number.");
        }
        else
        {
            System.out.println(temp+" is not a Strong number.");
        }
    }
}