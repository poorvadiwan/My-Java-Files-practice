package com.company;

import java.util.Scanner;

public class print_pattern {
    public static void main(String[] args) {

        /*Print pattern
        number = 3
        *
        ***
        *****

        int x=1, count=1;

        Scanner input = new Scanner(System.in);
        System.out.println(input.nextLine());
        System.out.println("enter the number here:");
        int n = Integer.parseInt(input.nextLine());

        for (int i = 0; i <= n; i++) {
            String a = "*";
           if(x<=n){
               System.out.println(a.repeat(count));
           }
                x+=1;
                count+=2;

            }
        */

        Scanner in = new Scanner(System.in);
        int count = 0,n , rem;

        System.out.println(in.nextLine());
        System.out.println("Enter the number to be checked:");
        n = Integer.parseInt(in.nextLine());


        Scanner in2 = new Scanner(System.in);
        System.out.println(in2.nextLine());
        System.out.println("enter the repeating number");
        int x = Integer.parseInt(in2.nextLine());

        while(n > 0){
            rem = n%10;
            if(rem==x){
                count++;
            }
            n/=10;
        }

        System.out.println(count);

    }
}


