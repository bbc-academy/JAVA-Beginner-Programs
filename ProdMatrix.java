import java.util.Scanner;
public class ProdMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows & columns : ");
        byte row=sc.nextByte();
        byte col=sc.nextByte();
        int mat1[][]=new int[row][col];
        int mat2[][]=new int[row][col];
        System.out.println("Enter the Elements for 1st Matrix :");
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the Elements for 2nd Matrix :");
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        int addMatrix[][]=new int[row][col];

        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                addMatrix[i][j]=mat1[i][j]*mat2[i][j];
            }
        }
        System.out.println("Your Product of matrix is as follow :");
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                System.out.print(addMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}