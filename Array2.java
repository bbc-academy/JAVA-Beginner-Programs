import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0, prod=1;
        System.out.println("Enter the range of Array : ");
        int rng=sc.nextInt();
        int[] array=new int[rng];
        System.out.println("Enter the "+rng+" elements for the array : ");
        for(int i=0 ; i<rng ; i++) {
            System.out.print("Element "+(i+1)+" : ");
            array[i]=sc.nextInt();
            sum+=array[i];
            prod*=array[i];
        }
        System.out.println("\nThe values of array are as follow : ");
        for(int j=0 ; j<rng ; j++) {
            System.out.println("Element "+(j+1)+" : "+array[j]);
        }
        System.out.println("The sum of all elements are : "+sum);
        System.out.println("The product of all elements are : "+prod);
    }
}