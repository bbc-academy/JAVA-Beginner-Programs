//Program to understand function with return but without argument
import java.util.Scanner;
public class Return {
    public int add()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any 2 numbers : ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        return num1+num2;
    }
    public static void main(String[] args) {
        Return math=new Return();
        System.out.println("The sum is : "+math.add());
    }
}
