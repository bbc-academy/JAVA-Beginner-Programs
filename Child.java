public class Child extends Parent {
    public static void main(String[] args) {
        Child father=new Child();
        System.out.println("The value of name is "+father.name+" and age is "+father.age);
        father.name_age();
    }
}
