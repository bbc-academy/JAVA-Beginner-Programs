// WAP to understand Relational Operators
public class Relational {
    public static void main(String args[]){
        int a=10,b=20;

        System.out.println("a>b [10>20] ? : ");
        if(a>b){
            System.out.println("True"); //Not Executed
        }
        else{
            System.out.println("False"); //Executed
        }

        System.out.println("a<b [10<20] ? :");
        if(a<b){
            System.out.println("True"); //Executed
        }
        else{
            System.out.println("False"); //Not Executed
        }

        System.out.println("a==b [10==20] ? : ");
        if(a==b){
            System.out.println("True"); // Not Executed
        }
        else{
            System.out.println("False"); //Executed
        }

        System.out.println("a!=b [10!=20] ? :");
        if(a!=b){
            System.out.println("True"); //Executed
        }
        else{
            System.out.println("False"); // Not Executed
        }

        System.out.println("a>=b [10>=20] ? : ");
        if(a>=b){
            System.out.println("True"); // Not Executed
        }
        else{
            System.out.println("False"); //Executed
        }

        System.out.println("a<=b [10<=20] ? :");
        if(a<=b){
            System.out.println("True"); //Executed
        }
        else{
            System.out.println("False"); // Not Executed
        }

        a=15; b=15;
        System.out.println("a<=b [15<=15] ? :");
        if(a<=b){
            System.out.println("True"); //Executed
        }
        else{
            System.out.println("False"); // Not Executed
        }
    }
}