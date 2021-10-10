import java.util.Scanner;

public class Loop {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int i=1;

        System.out.println("Enter any number : ");
        int num=sc.nextInt();

        while(i<=10)
        {
            System.out.println(num+" X "+i+" = "+num*i);
            i++;
        }

    }
}
