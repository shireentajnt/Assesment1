import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Enter the first string :");
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();

        System.out.println("Enter the second string :");
        Scanner scCost = new Scanner(System.in);
        String sec = scCost.nextLine();

        char posStr=sec.charAt(3);
        boolean check=first.equalsIgnoreCase(sec);


        System.out.println("Substring :"+first.substring(3));
        System.out.println("The character at 3rd position in the second string is : "+posStr);
        System.out.println("Are string 1 and string 2 equal? : "+check);
        System.out.println("Concatenated string : "+first.concat(sec));
    }
}
