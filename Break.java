//WAP to understand break statement using for loop
public class Break {
    public static void main(String args[]){

        for(int i=1 ; i<=10 ; i++) // 1<=10, 2<=10, 3<=10, 4<=10
        {
            if(i==5) // 1==5, 2==5, 3==5, 4==5, 5==5[true]
            {
                break; // X, X, X, X, Execute
            }
            System.out.println(i); // 1, 2, 3, 4
        }
        System.out.println("Out of For Loop....!!!!!");
    }
}
