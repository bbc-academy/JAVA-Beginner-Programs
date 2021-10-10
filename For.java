import java.util.Scanner;
public class For {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name & age :");
        String name=sc.nextLine();
        byte age=sc.nextByte();

        for(int i=1 ; i<=age ; i++)
        {
            System.out.println(i+". "+name);
        }
    }
}
