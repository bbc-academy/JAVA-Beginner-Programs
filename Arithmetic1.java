import java.util.Scanner;
public class Arithmetic1 {
    static void add(){ //implementations
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any 2 numbers : ");
        int num1=sc.nextInt(); //Local Variables
        int num2=sc.nextInt(); //Local Variables
        int res=num1+num2; //Local Variables
        System.out.println("The addition is : "+res);
    }
    static void diff(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any 2 numbers : ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int res=num1-num2;
        System.out.println("The difference is : "+res);
    }
    static void prod(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any 2 numbers : ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int res=num1*num2;
        System.out.println("The product is : "+res);
    }
    static void div(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any 2 numbers : ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int res=num1/num2;
        System.out.println("The division is : "+res);
    }
    static void rem(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any 2 numbers : ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int res=num1%num2;
        System.out.println("The remainder is : "+res);
    }
    public static void main(String[] args) {
        add(); //calling
        diff(); //calling
        prod(); //calling
        div(); //calling
        rem(); //calling
    }
}