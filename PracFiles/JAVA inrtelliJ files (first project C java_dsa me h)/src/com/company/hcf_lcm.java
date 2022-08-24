package com.company;

import java.util.Scanner;

public class hcf_lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        int a = input.nextInt();
        int b = input.nextInt();

        //when only lcm is asked:-
        /*int max=a,lcm;
        if(b>a){
            max=b;
        }
        while (true) {
            if (((max % a) == 0) && ((max % b) == 0)) {
                System.out.println("The LCM of " + a + " and " + b + " is " + max);
                break;
            }
            ++max;
        }*/

        // hcf of two given numbers:-
        /*int max=a,lcm;
        if(b>a){
            max=b;
        }
        for (int i = 1; i <= max; i++) {
            if(((a%i)==0)&&((b%i)==0)){
                System.out.println("The hcf of " + a + " and " + b + " is " + i);
            }
        }*/

        //when both are asked in a single quwstion
        int hcf=0, max=a,lcm;
        if(b>a){
            max=b;
        }
        for (int i = 1; i <= max; i++) {
            if(((a%i)==0)&&((b%i)==0)){
               hcf=i;
            }
        }
        lcm=(a*b)/hcf;
        System.out.println("The hcf and lcm of "+a+" and "+b+" are " +hcf+" "+lcm);
    }
}
