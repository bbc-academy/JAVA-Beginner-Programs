//WAP to swap values of 2 numbers with the help of temp variable.
import java.util.Scanner;
public class Swapping {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any 2 numbers : ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        System.out.println("Before Swapping num1 : "+num1+" & num2 : "+num2);

        int temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("After Swapping num1 : "+num1+" & num2 : "+num2);

    }
}
