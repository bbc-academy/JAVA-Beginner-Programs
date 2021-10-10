public class Sub extends Super{
    public String method(String a){
        return a;
    }

    public static void main(String[] args) {
        Sub obj=new Sub();
        System.out.println(obj.method());
        System.out.println(obj.method("Mera bhai h tu....!!!!!"));
    }
}