package assignment2;

import java.util.Scanner;

public class rupees_usd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double ind, usd=0;
        System.out.println("Enter amount in rupees:");
        ind = input.nextDouble();
        usd = ind/75.33;
        System.out.println("Your Indian rupees would be "+usd+"$");
    }
}
