package com.company;

import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        for (int i = 0; i <= 10; i++) {

            int ans = a*i;
            System.out.println(a + " * " +i+" = "+ans);
        }
    }
}
