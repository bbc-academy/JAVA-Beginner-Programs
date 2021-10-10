import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range of array : ");
        byte range=sc.nextByte();
        int[] array =new int[range]; //range=5
        System.out.println("Enter the "+range+" elements in array :");
        int i;
        for(i=0 ; i<range ; i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the value to search : ");
        byte search=sc.nextByte(); // 4
        for (i=0 ; i<range ; i++)
        {
            if(search==array[i])
            {
                System.out.println(search+" is found at position : "+(i+1));
                break;
            }
        }
        if(i==range)
        {
            System.out.println(search+" isn't found in array.");
        }
    }
}