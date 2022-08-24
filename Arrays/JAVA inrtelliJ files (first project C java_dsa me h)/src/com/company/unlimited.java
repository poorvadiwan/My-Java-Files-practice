package com.company;

import java.util.Scanner;

public class unlimited {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       /*

       //loop stops for x
       int temp=0;
        while(true){
            System.out.println("Enter a number:");
            char a = input.next().trim().charAt(0);

            if(a=='x'){
                break;
            }
            else{
                int b = Integer.parseInt(String.valueOf(a));
                temp=b+temp;
            }
        }
        System.out.println("Sum is: "+temp );*/

       // if the loop has to stop at 0:-
        int temp=0;
        while(true){
            System.out.println("Enter any number:");
            int a = input.nextInt();

            temp=a+temp;
            if(a==0){
            break;
            }
        }
        System.out.println("Sum is "+temp);
    }
}
