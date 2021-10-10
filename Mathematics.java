//Program to find remainder using functions with no return but an argument.
public class Mathematics {
    public void remainder(int numer, int denom)
    {
        int rem = numer % denom;
        System.out.println("The remainder value is : "+rem);
    }
    public static void main(String[] args) {
        Mathematics math=new Mathematics();
        math.remainder(45,7);
    }
}
