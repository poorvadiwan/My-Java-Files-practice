package com.company;

import java.util.Scanner;

public class largest_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
/*
    //my way
        if((a>b)&&(a>c)){
            System.out.println("a is the largest number");
        }
        else
            if((b>c)&&(b>a)){
                System.out.println("b is the largest number");
            }
            else
            if((c>b)&&(c>a)){
                System.out.println("c is the largest number");
            }
            else
            {
                System.out.println("Numbers are equal. Enter indifferent numbers");
            }

 */

        /*
        //more correct
        int max=a;
        if(b>max){
           max = b;
        }
        if(c>max){
            max = c;
        }
        System.out.println(max);

         */

        //more optimised solution
        int max= Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
