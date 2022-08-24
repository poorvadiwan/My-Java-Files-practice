package com.company;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextLine());
        System.out.println("Enter the number here:");
        int n = Integer.parseInt(input.nextLine());
        int reverse = 0;

        while(n>0){
            int rem = n%10;
           reverse = (reverse*10) + rem;
           n/=10;
        }
        System.out.println(reverse);
    }
}
