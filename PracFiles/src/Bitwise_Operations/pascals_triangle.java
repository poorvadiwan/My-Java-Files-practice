package Bitwise_Operations;

import java.util.Scanner;

public class pascals_triangle {
    public static void main(String[] args){
        // Problem Statement : find the sum of the digits in the nth row
        /*
        1
        1 1
        1 2 1
        1 3 3 1
        1 6 4 6 1
        1 10 5 5 10 1
        .....
         */

        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("Enter the nth row:");
            int n = in.nextInt();
            //int ans = (int) Math.pow(2, n - 1);
            int ans = 1<<(n-1);
            System.out.println("Sum is " + ans);
        }
    }
}
