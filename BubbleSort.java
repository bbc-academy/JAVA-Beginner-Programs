import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Sorting in ascending order by Bubble Sort Technique.");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of integers to sort : ");
        byte num=sc.nextByte();

        int[] array = new int[num];

        System.out.println("Feed "+num+" elements to your array : ");
        for (int i=0 ; i<num ; i++)
        {
            array[i] = sc.nextInt();
        }

        for (int i=0; i<num-1 ; i++)
        {
            for (int j=0 ; j<num-i-1 ; j++)
            {
                if (array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }

        System.out.println("Sorted list of array is : ");
        for (int i=0 ; i<num ; i++)
        {
            System.out.println(array[i]);
        }

    }
}
