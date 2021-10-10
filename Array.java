import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array = new int[10];

        System.out.println("Enter any 10 Elements for the array:");
        for (int i=0 ; i<10 ; i++)
        {
            array[i]=sc.nextInt();
        }

        System.out.println("Elements of array are as follow:");
        for (int i=0 ; i<10 ; i++)
        {
            System.out.println("Array["+i+"] : "+array[i]);
        }
    }
}
