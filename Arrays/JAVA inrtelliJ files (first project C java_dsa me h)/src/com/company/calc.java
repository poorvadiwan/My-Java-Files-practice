package com.company;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {


        int ans =0;
        while(true) {

            Scanner in = new Scanner(System.in);
            System.out.println(in.nextLine());
            System.out.println("Enter the operation");
            char op = in.next().trim().charAt(0);

            if ((op == 'x') || (op == 'X')) {
                System.exit(0);
              }
              else {

                System.out.println(in.nextLine());
                System.out.println("Enter the two numbers");
                int a = in.nextInt();
                int b = in.nextInt();

                if ((a > b) && (op == '+' || op == '-' || op == '*' || op == '/' || op == '%')) {
                    if (op == '+') {
                        ans = a + b;
                    }
                    if (op == '-') {
                        ans = a - b;
                    }
                    if (op == '*') {
                        ans = a * b;
                    }
                    if (op == '/') {
                        ans = a / b;
                    }
                    if (op == '%') {
                        ans = a % b;
                    }
                } else {
                    if (op == '+') {
                        ans = a + b;
                    }
                    if (op == '-') {
                        ans = b - a;
                    }
                    if (op == '*') {
                        ans = a * b;
                    }
                    if (op == '/') {
                        ans = b / a;
                    }
                    if (op == '%') {
                        ans = b % a;
                    }
                }
                System.out.println(ans);

            }
        }
        }
    }

