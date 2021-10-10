import java.util.Scanner;
public class Polymorphism {

    public void add(double a, double b)
    {
        System.out.println("The Addition is "+(a+b));
    }
    public int add(int a, int b)
    {
        return a+b;
    }
    public double add(double a, double b, double c)
    {
        return a+b+c;
    }
    public static void main(String[] args) {
        Polymorphism obj=new Polymorphism();
        obj.add(12,23);
        obj.add(12,23,34);
        obj.add(112.233,12.303);
        System.out.println(obj.add(12,23));
        System.out.println(obj.add(12.33,14.252, 25.336));
    }
}