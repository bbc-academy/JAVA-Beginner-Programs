import java.util.Scanner;
public class Numbers {
    public void Ispalin()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number : ");
        System.out.println();
        int num=sc.nextInt();
        int temp=num, rev=0;
        while(num!=0)
        {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if(temp==rev){
            System.out.println(temp+" is a Palindrome Number.");
        }
        else{
            System.out.println(temp+" isn't a Palindrome Number.");
        }
    }
    public void Isarm()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number : ");
        System.out.println();
        int num=sc.nextInt();
        int temp=num, arm=0;
        while(num!=0)
        {
            int rem = num % 10;
            arm = arm + rem * rem * rem;
            num = num / 10;
        }
        if(temp==arm){
            System.out.println(temp+" is an Armstrong Number.");
        }
        else{
            System.out.println(temp+" isn't a Armstrong Number.");
        }
    }
    public void Isstrong()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number : ");
        System.out.println();
        int num=sc.nextInt();
        int temp=num, sum=0;

        while(num!=0)
        {
            int i=1, fact=1;
            int rem=num%10;
            while(i<=rem)
            {
                fact=fact*i;
                i++;
            }
            sum=sum+fact;
            num=num/10;
        }
        if(temp==sum){
            System.out.println(temp+" is a Strong number.");
        }
        else{
            System.out.println(temp+" isn't a Strong number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Numbers spn=new Numbers();
        System.out.println("I can check 3 special numbers : ");
        System.out.print("1. Palindrome Number \n" +
                "2. Armstrong number\n" +
                "3. Strong / Special / Krishnamurthy Number\n" +
                "Enter your choice : ");
        System.out.println();
        byte ch=sc.nextByte();
        if(ch==1)
        {
            spn.Ispalin();
        }
        else if(ch==2)
        {
            spn.Isarm();
        }
        else if(ch==3)
        {
            spn.Isstrong();
        }
        else {
            System.out.println("Invalid Input.");
        }
    }
}