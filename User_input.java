//WAP to input username & age and print it in form like Hello Ram. You are 18 years old.
import java.util.Scanner;
public class User_input {
    public static void main(String args[]){

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name=scan.nextLine();
        System.out.println("Enter your age : ");
        int age=scan.nextInt();
        System.out.println("Hello "+name+". You are "+age+" years old.");
        System.out.println("Welcome to BBC Academy");

    }
}
