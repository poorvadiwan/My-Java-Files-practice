package assignment2;

import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextLine());
        System.out.println("Enter the principle amount:");
        int p = in.nextInt();
        System.out.println(in.nextLine());
        System.out.println("Enter rate:");
        int r = in.nextInt();
        System.out.println(in.nextLine());
        System.out.println("Enter time:");
        int t = in.nextInt();
        int si = (p*r*t)/100;
        System.out.println("The simple interest is " + si);

    }
}
