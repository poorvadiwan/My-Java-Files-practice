package Bitwise_Operations;

import java.util.Scanner;

public class xor_form_a2b {
    public static void main(String args[]){
        System.out.println("XOR from a to b");
        System.out.println("Enter the two numbers");
        Scanner in = new Scanner(System.in);

        int a = in.nextInt(), b = in.nextInt();
        System.out.println(xor(a-1)^xor(b));
    }
    public static int xor(int num){
        int  xor = 0;

        if(num%4 == 0 ){
            xor = 0;
        }else if(num%4 == 1){
            xor = 1;
        }else if(num%4 == 2){
            xor = num+1;
        }
        return xor;
    }
}
