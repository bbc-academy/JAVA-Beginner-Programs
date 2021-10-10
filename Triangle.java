//WAP to accept Side, Height & Base of triangle & find perimeter and area.
import java.util.Scanner;
public class Triangle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Side, Height & Base of a triangle : ");
        double side=sc.nextDouble();
        double hgt=sc.nextDouble();
        double base=sc.nextDouble();

        double per=side+hgt+base;
        double area=(0.5)*base+hgt;

        System.out.println("The perimeter of triangle is : "+per);
        System.out.println("The area of triangle is : "+area);
    }
}