import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();


        int[] num=new int[count];
        String[] str=new String[count];
        System.out.println("Enter numbers :");
        for(int i=0;i<count;i++){
            Scanner scCost = new Scanner(System.in);
            num[i] = scCost.nextInt();
        }

        System.out.println("Enter strings :");
        for(int i=0;i<count;i++){
            Scanner scCost = new Scanner(System.in);
            str[i] = scCost.nextLine();
        }

        System.out.println("Displaying numbers ");
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }

        System.out.println("Displaying strings ");
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }


    }
}
