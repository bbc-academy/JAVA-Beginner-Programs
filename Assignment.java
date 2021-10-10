//WAP to understand the assignment operators
public class Assignment {
    public static void main(String args[]){
        int num1=10;
        System.out.println(num1);

        System.out.println("Assignment Operator [+=] : "); // lhs = lhs + rhs
        num1+=20; // num1 = 10 + 20 = 30;
        System.out.println("The value of num1 is : "+num1);//The value of num1 is : 30

        System.out.println("Assignment Operator [-=] : "); // lhs = lhs - rhs
        num1-=20; // num1 = 30 - 20 = 10;
        System.out.println("The value of num1 is : "+num1);//The value of num1 is : 10

        System.out.println("Assignment Operator [*=] : "); // lhs = lhs * rhs
        num1*=20; // num1 = 10 * 20 = 200;
        System.out.println("The value of num1 is : "+num1);//The value of num1 is : 200

        System.out.println("Assignment Operator [/=] : "); // lhs = lhs / rhs
        num1/=20; // num1 = 200 / 20 = 10;
        System.out.println("The value of num1 is : "+num1);//The value of num1 is : 10
    }
}
