package com.company;

import java.util.Scanner;

public class sum_of_2numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sum number:");
        int a = input.nextInt();
        System.out.println(input.nextLine());
        System.out.println("Enter the second number:");
        int b = input.nextInt();
        int c = a+b;
        System.out.println("The sum is " + c);
    }
}
