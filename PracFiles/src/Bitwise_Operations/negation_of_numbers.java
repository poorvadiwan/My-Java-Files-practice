package Bitwise_Operations;

import java.util.Scanner;

public class negation_of_numbers {
    public static void main(String[] args){
        // 2's compliment method
        /*
        s1. take compliment of the number
        s2. add 1
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        System.out.println((~num)+1);
    }
}
