public class Pattern {
    public static void main(String args[]){
        for(int i=1 ; i<=5 ; i++)
        {
            for(int j=4 ; j>=i ; j--)
            {
                System.out.print(" ");
            }
            for(int k=2 ; k<=i ; k++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int i=5 ; i>=1 ; i--) // Row
        {
            for(int j=5 ; j>=1 ; j--)// Col
            {
                if(i>=j)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
/*
     *
    * *
   * * *
  * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
 */