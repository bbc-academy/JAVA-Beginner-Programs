// No return but with argument
import java.util.Scanner;
public class Maths {
    public void add(int x, int y)
    {
        int sum=x+y;
        System.out.println("The sum is : "+sum);
    }
    public static void main(String[] args) {
        Maths obj=new Maths();
        obj.add(12,23); //Method Calling
    }
}