public class Student extends Teacher {
    public int BTECH = 2015;

    @Override
    public void study()
    {
        System.out.println("Studying all day long.");
    }

    public static void main(String[] args) {
        Student obj=new Student();
        System.out.println("First name of teacher : "+obj.fname);
        System.out.println("Age of teacher : "+obj.age);
        obj.study();
        System.out.println("My B.TECH completion year : "+obj.BTECH);
    }
}
