package Bitwise_Operations;

import java.util.Scanner;

public class power_of_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt(), count = 0;
        while(num!=0){
            if((num&1)==1)
               count++;
            num>>=1;
        }
        if(count == 1){
            System.out.println("The number is a power of two");
        }else{
            System.out.println("The number is not a power of two");
        }
    }
}
