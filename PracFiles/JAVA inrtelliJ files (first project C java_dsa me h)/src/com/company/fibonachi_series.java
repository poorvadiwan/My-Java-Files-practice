package com.company;

import java.util.Scanner;

public class fibonachi_series {
    public static void main(String[] args) {

       /*

       //this program gives the series

        int a = 0;
        int b=1;
        int c=0;

        Scanner input = new Scanner(System.in);
        int n= input.nextInt();

        for (int i = 0; i <=n; i++) {
            System.out.println(c);
            a=b;
            b=c;
            c=a+b;
          //  i--;
        }
        */

        // this program gives the nth fibonachi number asked

        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int count=2;
        int a=0,b=1;

        while(count<=n){
            int temp = b;
            b= a + b;
            a=temp;
            count++;
        }
        System.out.println(b);
    }
}
