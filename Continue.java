//WAP to understand the continue statement
public class Continue {
    public static void main(String args[]){
        int i=1; //i=1
        while(i<=10) //11<=10[f]
        {
            if(i==5) //6==5[f]
            {
                i++;//6
                continue;//skipped
            }
            System.out.println(i); //1 , 2 , 3 , 4 , skip, 6 , 7 , 8 , 9 , 10
            i++; //5, skip, 6,7,8,9,10,11
        }
        System.out.println("End of while loop.");
    }
}