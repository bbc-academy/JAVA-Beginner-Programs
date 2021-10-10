import java.util.Scanner;

public class BubbleSort1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nBubble Sorting Technique For Descending Order\n");

        System.out.print("Enter the range of array : ");
        byte range=sc.nextByte(); // range = 5

        int[] array=new int[range]; // index = 0,1,2,3,4

        System.out.println("\nFeed the "+range+" elements in your array : ");
        for (int i=0 ; i<range ; i++) {
            array[i]=sc.nextInt();
        }

        for (int i=0 ; i<range-1 ; i++){
            for (int j=0 ; j<range-i-1 ; j++){
                if (array[j] < array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted Array is : ");
        for (int i=0 ; i<range ; i++){
            System.out.print(array[i]+" ");
        }
    }
}
