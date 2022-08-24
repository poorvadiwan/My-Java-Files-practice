package com.company;

import java.util.Scanner;

public class leap_year_program {
    public static void main(String[] args) {
        /*

         //This code did not work:-
         Scanner a = new Scanner(System.in);
        System.out.println("Enter year:");
        int number = a.nextInt();

      if(((number%4)==0)&&((number%400)==0)&&((number%100)!=0)){
            System.out.println(number+" is Leap Year");
        }
        else{
            System.out.println(number+" is not Leap Year");
        }
       */

        /*
        //flag is a substitute variable
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any year:");
        int year = s.nextInt();
        boolean flag = false;
        if(year % 400 == 0)
        {
            flag = true;
        }
        else if (year % 100 == 0)
        {
            flag = false;
        }
        else if(year % 4 == 0)
        { flag = true;
        }
        else
        {
            flag = false;
        }
        if(flag)
        {
            System.out.println("Year "+year+" is a Leap Year");
        }
        else
        {
            System.out.println("Year "+year+" is not a Leap Year");
        }*/

        if(2020%400==0){
            System.out.println("leap year");
        }
    }
}
