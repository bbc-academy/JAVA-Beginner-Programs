//WAP to accept length & breadth of rectangle and find its perimeter & area.
import java.util.Scanner;
public class Rectangle {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the length & width of Rectangle : ");
        double len=sc.nextDouble();
        double wid=sc.nextDouble();

        double per= 2 * (len+wid);
        double area = len * wid;

        System.out.println("The perimeter of rectangle is : "+per);
        System.out.println("The area of rectangle is : "+area);
    }
}
