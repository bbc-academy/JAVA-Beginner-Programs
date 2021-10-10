import java.util.Scanner;
public class Array2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns : ");
        byte row=sc.nextByte();
        byte col=sc.nextByte();
        int[][] array =new int[row][col];
        System.out.println("Feed the "+row+" X "+col+" Matrix : ");
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                System.out.println("Element "+(i+1)+" X "+(j+1)+" : ");
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("Your Matrix is :");
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}