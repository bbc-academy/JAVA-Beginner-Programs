//WAP to understand the concept of break with infinite loop.
import java.util.Scanner;
public class Infinite_loop {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int count=1;
        while(true)
        {
            System.out.println(count+". This is an Infinite Loop.");
            System.out.println("Press 0 to exit & 1 to continue.");
            byte choice=sc.nextByte();
            if(choice==0)
            {
                break;
            }
            count++;
        }
    }
}
