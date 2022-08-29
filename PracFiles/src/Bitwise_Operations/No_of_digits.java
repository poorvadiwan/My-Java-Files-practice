package Bitwise_Operations;
import java.util.Scanner;

public class No_of_digits {
    public static void main(String[] args){
        //Problem Statement : find the number of digits of a given number in the given base representation

        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int num = in.nextInt();
        System.out.println("Enter the base");
        int base = in.nextInt();

        int ans = (int)(Math.log(num)/Math.log(base)) + 1;
        System.out.println("Answer is "+ans);
    }
}
