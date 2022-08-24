package com.company;

import java.util.Scanner;

public class switch_statement {
    public static void main(String[] args) {


    /*   while(true) {
           Scanner in = new Scanner(System.in);
           String fruit = in.next();

           switch (fruit) {
               case "mango" -> System.out.println("Mango is the king of fruits");
               case "orange" -> System.out.println("Orange is orange in colour");
               case "grape" -> System.out.println("Grapes are small in size");
               case "coconut" -> System.out.println("coconut is hard from outside but soft from inside");
               default -> System.out.println("Enter a valid fruit");
           }
       }*/

        Scanner in = new Scanner(System.in);
        String day = in.next();

        switch (day){
            case "monday","tuesday", "wednesday", "thursday", "friday" ->
                System.out.println("Weekdays");
            case "saturday", "sunday" ->
                    System.out.println("Weekends");
            default -> System.out.println("Enter a valid day!!");
        }
    }
}
