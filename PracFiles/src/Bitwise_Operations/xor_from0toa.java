package Bitwise_Operations;

import java.util.Scanner;

public class xor_from0toa {
    public static void main(String[] args) {
        System.out.println("XOR of a number from 0 to a");
        System.out.println("enter the number");
        Scanner in  = new Scanner(System.in);
        int num = in.nextInt(), xor = 0;

        if(num%4 == 0 ){
            xor = 0;
        }else if(num%4 == 1){
            xor = 1;
        }else if(num%4 == 2){
            xor = num+1;
        }

        System.out.println();
        //if(num%4 == 3)
        //xor = 0
    }
}
