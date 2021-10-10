import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the range of array");
        int i;
        byte r = sc.nextByte();
        int a[]= new int[r];
        System.out.println("enter the"+r+"elements in array" );
        for (i=0;i<r;i++)
        {
            a[i]=sc.nextInt();

        }
        System.out.println("enter the value of search");
        byte s =sc.nextByte();
        for (i=0;i<r;i++){
            if (s==a[i]);
            {
                System.out.println(s+" is found at position : "+(i+1));
                break;
            }
        }
        if (i==r){
            System.out.println(s+" is not found in array");
        }
    }
}