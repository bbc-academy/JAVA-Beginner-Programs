public class Myclass {
    int x;

    public Myclass(int a){
        x=a;
    }

    public static void main(String[] args) {
        Myclass myObj=new Myclass(5);

        System.out.println(myObj.x);
    }
}