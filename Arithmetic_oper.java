import java.util.Scanner;

public class Arithmetic_oper {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any 2 numbers : ");
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();

        double add=num1+num2;
        double sub=num1-num2;
        double prod=num1*num2;
        double div=num1/num2;
        double rem=num1%num2;

        System.out.println("Addition : "+add);
        System.out.println("Subraction : "+sub);
        System.out.println("Multiplication : "+prod);
        System.out.println("Division : "+div);
        System.out.println("Remainder : "+rem);
    }
}
