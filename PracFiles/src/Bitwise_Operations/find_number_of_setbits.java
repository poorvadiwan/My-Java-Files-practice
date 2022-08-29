package Bitwise_Operations;

import java.util.Scanner;

public class find_number_of_setbits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        System.out.println(Integer.toBinaryString(n));
        int count = 0;

        //right most set bit method
        /*
        while(n>0){
            count++;
            n -=(n & (-n));
        }
        System.out.println(count);
        */

        // n & (n-1)
        while(n>0){
            count++;
            n = n & (n-1);
        }
        System.out.println(count);
    }
}
