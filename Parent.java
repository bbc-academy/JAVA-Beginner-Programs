import java.util.Scanner;
public class Parent {
    String name="Papa Ji";
    byte age=45;
    public void name_age()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your father's name and age :");
        String name=sc.nextLine();
        byte age=sc.nextByte();
        System.out.println("Your father's name is "+name+" and age is "+age);
    }
}