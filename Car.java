import java.util.Scanner;

public class Car {
    int modelYear;
    String modelName;

    public Car(int year, String name)
    {
        modelYear=year;
        modelName=name;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the model name and model year of the car.");
        String name=sc.nextLine();
        int year=sc.nextInt();
        Car myCar=new Car(year, name);
        System.out.println("Model Name : "+myCar.modelName+" and Model Year : "+myCar.modelYear);
    }
}