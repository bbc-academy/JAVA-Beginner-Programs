import java.util.Scanner;

public class Square {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of a square : ");
        double side=sc.nextDouble();

        double per=4*side;
        double area=side*side;

        System.out.println("The perimeter of square is : "+per);
        System.out.println("The area of square is : "+area);

    }
}
