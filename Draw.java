import java.util.Scanner;
public class Draw {
    static void dashed() //Static method | No return & No argument | Implementations
    {
        System.out.println("--------------------------------------------------");
    }
    static void dotted() //Static method | No return & No argument | Implementations
    {
        System.out.println("..................................................");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What type of line you want?");
        System.out.println("1. Dashed(------)\n" +
                "2. Dotted(........)");
        byte ch=sc.nextByte();
        if(ch==1)
        {
            dashed(); //Function Calling
        }
        else if(ch==2)
        {
            dotted(); //Function Calling
        }
        else
        {
            System.out.println("Invalid Input.");
        }
    }
}