import java.util.Scanner;
public class Result {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st Student's name : ");
        String std1=sc.next();
        System.out.print("\nEnter the 2nd Student's name : ");
        String std2=sc.next();
        System.out.print("\nEnter the 3rd Student's name : ");
        String std3=sc.next();
        System.out.print("\nEnter the 4th Student's name : ");
        String std4=sc.next();
        System.out.print("\nEnter the 5th Student's name : ");
        String std5=sc.next();
        System.out.print("\n"+std1+"'s marks in 'C' : ");
        int c1=sc.nextInt();
        System.out.print("\n"+std2+"'s marks in 'C' : ");
        int c2=sc.nextInt();
        System.out.print("\n"+std3+"'s marks in 'C' : ");
        int c3=sc.nextInt();
        System.out.print("\n"+std4+"'s marks in 'C' : ");
        int c4=sc.nextInt();
        System.out.print("\n"+std5+"'s marks in 'C' : ");
        int c5=sc.nextInt();
        System.out.print("\n"+std1+"'s marks in 'JAVA' : ");
        int java1=sc.nextInt();
        System.out.print("\n"+std2+"'s marks in 'JAVA' : ");
        int java2=sc.nextInt();
        System.out.print("\n"+std3+"'s marks in 'JAVA' : ");
        int java3=sc.nextInt();
        System.out.print("\n"+std4+"'s marks in 'JAVA' : ");
        int java4=sc.nextInt();
        System.out.print("\n"+std5+"'s marks in 'JAVA' : ");
        int java5=sc.nextInt();
        System.out.print("\n"+std1+"'s marks in 'C++' : ");
        int cpp1=sc.nextInt();
        System.out.print("\n"+std2+"'s marks in 'C++' : ");
        int cpp2=sc.nextInt();
        System.out.print("\n"+std3+"'s marks in 'C++' : ");
        int cpp3=sc.nextInt();
        System.out.print("\n"+std4+"'s marks in 'C++' : ");
        int cpp4=sc.nextInt();
        System.out.print("\n"+std5+"'s marks in 'C++' : ");
        int cpp5=sc.nextInt();
        System.out.print("\n"+std1+"'s marks in 'HTML' : ");
        int html1=sc.nextInt();
        System.out.print("\n"+std2+"'s marks in 'HTML' : ");
        int html2=sc.nextInt();
        System.out.print("\n"+std3+"'s marks in 'HTML' : ");
        int html3=sc.nextInt();
        System.out.print("\n"+std4+"'s marks in 'HTML' : ");
        int html4=sc.nextInt();
        System.out.print("\n"+std5+"'s marks in 'HTML' : ");
        int html5=sc.nextInt();
        System.out.print("\n"+std1+"'s marks in 'PYTHON' : ");
        int py1=sc.nextInt();
        System.out.print("\n"+std2+"'s marks in 'PYTHON' : ");
        int py2=sc.nextInt();
        System.out.print("\n"+std3+"'s marks in 'PYTHON' : ");
        int py3=sc.nextInt();
        System.out.print("\n"+std4+"'s marks in 'PYTHON' : ");
        int py4=sc.nextInt();
        System.out.print("\n"+std5+"'s marks in 'PYTHON' : ");
        int py5=sc.nextInt();
        int t1=c1+java1+cpp1+html1+py1;
        int t2=c2+java2+cpp2+html2+py2;
        int t3=c3+java3+cpp3+html3+py3;
        int t4=c4+java4+cpp4+html4+py4;
        int t5=c5+java5+cpp5+html5+py5;
        double p1=t1/5;
        double p2=t2/5;
        double p3=t3/5;
        double p4=t4/5;
        double p5=t5/5;
        String grd1, grd2, grd3, grd4, grd5;
        if(p1>=85)
        {
            grd1="S";
        }
        else if(p1>=75)
        {
            grd1="A";
        }
        else if(p1>=65)
        {
            grd1="B";
        }
        else if(p1>=50)
        {
            grd1="C";
        }
        else
        {
            grd1="F";
        }
        if(p2>=85)
        {
            grd2="S";
        }
        else if(p2>=75)
        {
            grd2="A";
        }
        else if(p2>=65)
        {
            grd2="B";
        }
        else if(p2>=50)
        {
            grd2="C";
        }
        else
        {
            grd2="F";
        }
        if(p3>=85)
        {
            grd3="S";
        }
        else if(p3>=75)
        {
            grd3="A";
        }
        else if(p3>=65)
        {
            grd3="B";
        }
        else if(p3>=50)
        {
            grd3="C";
        }
        else
        {
            grd3="F";
        }
        if(p4>=85)
        {
            grd4="S";
        }
        else if(p4>=75)
        {
            grd4="A";
        }
        else if(p4>=65)
        {
            grd4="B";
        }
        else if(p4>=50)
        {
            grd4="C";
        }
        else
        {
            grd4="F";
        }

        if(p5>=85)
        {
            grd5="S";
        }
        else if(p5>=75)
        {
            grd5="A";
        }
        else if(p5>=65)
        {
            grd5="B";
        }
        else if(p5>=50)
        {
            grd5="C";
        }
        else
        {
            grd5="F";
        }
        System.out.println("*********************************************************************************");
        System.out.println("\t\t\tBBCA Result for Session 2020-21");
        System.out.println("*********************************************************************************");
        System.out.println("\tStud\tC\tJAVA\tC++\tHTML\tPYTHON\tTOTAL\tPERCENT\tGRADE");
        System.out.println("\t"+std1+"\t\t"+c1+"\t"+java1+"\t\t"+cpp1+"\t"+html1+"\t\t"+py1+"\t\t"+t1+"\t\t"+p1+"\t\t"+grd1);
        System.out.println("\t"+std2+"\t\t"+c2+"\t"+java2+"\t\t"+cpp2+"\t"+html2+"\t\t"+py2+"\t\t"+t2+"\t\t"+p2+"\t\t"+grd2);
        System.out.println("\t"+std3+"\t\t"+c3+"\t"+java3+"\t\t"+cpp3+"\t"+html3+"\t\t"+py3+"\t\t"+t3+"\t\t"+p3+"\t\t"+grd3);
        System.out.println("\t"+std4+"\t\t"+c4+"\t"+java4+"\t\t"+cpp4+"\t"+html4+"\t\t"+py4+"\t\t"+t4+"\t\t"+p4+"\t\t"+grd4);
        System.out.println("\t"+std5+"\t\t"+c5+"\t"+java5+"\t\t"+cpp5+"\t"+html5+"\t\t"+py5+"\t\t"+t5+"\t\t"+p5+"\t\t"+grd5);
    }
}