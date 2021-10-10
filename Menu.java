import java.util.Scanner;
public class Menu {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Hi, Welcome to the arithmetic calculator.");
        System.out.println("I can help you with the following features : ");
        System.out.println("1. Addition\n" +
                "2. Subtraction\n" +
                "3. Multiplication\n" +
                "4. Quotient Finding\n" +
                "5. Remainder Finding");
        System.out.print("\nEnter your choice : ");
        byte ch=sc.nextByte();
        if(ch==1)
        {
            System.out.println("\nEnter any 2 numbers : ");
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            System.out.println("The sum is : "+(num1+num2));
        }
        else if(ch==2)
        {
            System.out.println("\nEnter any 2 numbers : ");
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            System.out.println("The difference is : "+(num1-num2));
        }
        else if(ch==3)
        {
            System.out.println("\nEnter any 2 numbers : ");
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            System.out.println("The product is : "+(num1*num2));
        }
        else if(ch==4)
        {
            System.out.println("\nEnter any 2 numbers : ");
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            System.out.println("The quotient is : "+(num1/num2));
        }
        else if(ch==5)
        {
            System.out.println("\nEnter any 2 numbers : ");
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            System.out.println("The remainder is : "+(num1%num2));
        }
        else
        {
            System.out.println("\nInvalid Input. Please run the code Again.");
        }
    }
}