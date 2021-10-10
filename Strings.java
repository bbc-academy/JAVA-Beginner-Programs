import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String website="BBCAcademy.teachmint.in";
        System.out.println("My String is : "+website);

        System.out.println("The length is : "+website.length()); //23
        System.out.println("String after lower case : "+website.toLowerCase());
        System.out.println("String after upper case : "+website.toUpperCase());
        System.out.println("Character at 4th Index : "+website.charAt(4)); //c
        System.out.println("Index of 't' in string is : "+website.indexOf('t')); //11
        System.out.println("Substring from 11th index : "+website.substring(11)); //eachmint.in
        System.out.println("Substring from 0 to 11th index : "+website.substring(0,11)); //BBCAcademy.t
        System.out.println("String after replacing 'i' with 'o' : "+website.replace('i','o'));

        System.out.println("Is string equals to 'bbcacademy.teachmint.in' : "+website.equals("bbcacdemy.techmint.in"));
        System.out.println("Is string equals to 'bbcacademy.teachmint.in' : "+website.equalsIgnoreCase("bbcacademy.teachmint.in"));

        String urlRaw="      https://www.     ";
        System.out.println("String url is \""+urlRaw+"\"");

    }
}
