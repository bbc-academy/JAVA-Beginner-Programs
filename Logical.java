//WAP to understand Logical OR(||), Logical AND(&&) and Bitwise NOT(!)
public class Logical {
    public static void main(String args[]){

        int x=10, y=20;

        System.out.println("Logical Or [ || ] : ");
        System.out.println("x>y || x<y : "+ (x>y || x<y)); //true
        System.out.println("x>y || x==y : "+ (x>y || x==y)); //false

        System.out.println("Logical And [ && ] : ");
        System.out.println("x>y && x<y : "+ (x>y && x<y)); //false
        System.out.println("x>y && x==y : "+ (x>y && x==y)); //false
        System.out.println("x<y && x!=y : "+ (x<y && x!=y)); //true

        System.out.println("Bitwise NOT [ ! ] : ");
        System.out.println("!(x>y || x<y) : "+ !(x>y || x<y)); //true --> false
        System.out.println("!(x>y || x==y) : "+ !(x>y || x==y)); //false --> true

    }
}