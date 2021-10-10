//WAP to understand Unary Operators
public class Unary {
    public static void main(String args){
        System.out.println("Increment Operators [obj++] / [++obj] : ");
        int x=10;
        System.out.println("Post Increment [x++] : "+x++); //x=x+1 => x=10+1 => x=11
        System.out.println("Post Increment [x++] : "+x++); //x=x+1 => x=11+1 => x=12
        System.out.println("Final Value of x is : "+x); //Final Value of x is : 12

        System.out.println("Pre Increment [++x] : "+(++x)); //x=x+1 => x=12+1 => x=12(13)
        System.out.println("Pre Increment [++x] : "+(++x)); //x=x+1 => x=13+1 => x=13(14)
        System.out.println("Final Value of x is : "+x); //Final Value of x is : 14

        System.out.println("Decrement Operators [obj--] / [--obj] : ");
        x=10;
        System.out.println("Post Increment [x--] : "+x--); //x=x-1 => x=10-1 => x=9
        System.out.println("Post Increment [x--] : "+x--); //x=x-1 => x=9-1 => x=8
        System.out.println("Final Value of x is : "+x); //Final Value of x is : 8

        System.out.println("Pre Increment [--x] : "+(--x)); //x=x-1 => x=8-1 => x=8(7)
        System.out.println("Pre Increment [--x] : "+(--x)); //x=x-1 => x=7-1 => x=7(6)
        System.out.println("Final Value of x is : "+x); //Final Value of x is : 6

    }
}