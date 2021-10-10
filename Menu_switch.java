import java.util.Scanner;
public class Menu_switch {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1, num2;
        System.out.println("Hi, Welcome to the arithmetic calculator.");
        System.out.println("I can help you with the following features : ");
        System.out.println("1. Addition\n" +
                "2. Subtraction\n" +
                "3. Multiplication\n" +
                "4. Quotient Finding\n" +
                "5. Remainder Finding");
        System.out.print("\nEnter your choice : ");
        byte ch=sc.nextByte();
        switch(ch)
        {
            case 1: System.out.println("\nEnter any 2 numbers : ");
                num1=sc.nextInt();
                num2=sc.nextInt();
                System.out.println("The sum is : "+(num1+num2));
                break;
            case 2: System.out.println("\nEnter any 2 numbers : ");
                num1=sc.nextInt();
                num2=sc.nextInt();
                System.out.println("The difference is : "+(num1-num2));
                break;
            case 3: System.out.println("\nEnter any 2 numbers : ");
                num1=sc.nextInt();
                num2=sc.nextInt();
                System.out.println("The product is : "+(num1*num2));
                break;
            case 4: System.out.println("\nEnter any 2 numbers : ");
                num1=sc.nextInt();
                num2=sc.nextInt();
                System.out.println("The quotient is : "+(num1/num2));
                break;
            case 5: System.out.println("\nEnter any 2 numbers : ");
                num1=sc.nextInt();
                num2=sc.nextInt();
                System.out.println("The remainder is : "+(num1%num2));
                break;
            default: System.out.println("Invalid Input. Please run the code Again.");
        }
    }
}
