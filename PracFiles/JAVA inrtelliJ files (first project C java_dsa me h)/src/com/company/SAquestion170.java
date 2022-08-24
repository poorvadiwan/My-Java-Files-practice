package com.company;

import java.util.Scanner;

public class SAquestion170 {

    public static void main(String[] args) {
	// write your code here
       int s,cr=0;
        System.out.println("*Welcome*");
        Scanner input1 = new Scanner(System.in);
        System.out.println(input1.nextLine());
        System.out.println("Enter your sales amount here:");
        s= Integer.parseInt(input1.nextLine());
        {
            if ((s > 0) && (s <= 5000)) {
                cr = 0;
            }
            if ((s > 5001) && (s <= 12000)) {
                cr = 3;
            }
            if ((s > 12001) && (s <= 22000)) {
                cr = 7;
            }
            if ((s > 22001) && (s <= 30000)) {
                cr = 10;
            }
            if (s > 30000) {
                cr = 15;
            }
        }
        System.out.println("Commission rate is " + cr + "%");
    }
}
