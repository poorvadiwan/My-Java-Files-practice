package com.company;


import java.util.Scanner;

public class upperORlower {
    public static void main(String[] args) {
       while(true){
           Scanner input = new Scanner(System.in);
        char a = input.next().trim().charAt(0);

        if (Character.isUpperCase(a)) {
            System.out.println("Uppercase");
        } else if (Character.isLowerCase(a)) {
            System.out.println("Lowercase");
        }
    }


        /*
        This is assignment ques week 1
        double radius= s.nextDouble();
        double perimeter;
        double area;
        perimeter = 2*Math.PI*radius;
        System.out.println( perimeter);
        area = (Math.PI)*(Math.PI)*radius;
        System.out.println( area);
         */

/*
       // This is assignment ques week 1
        int n = s.nextInt();
        int sum=0;
        int a = 0;
  for (int i = 1; i<=n;i++){

      if (a % 3 == 0)
          if (a % 2 == 0) {

              sum = a + sum;
          }
  a+=2;
 }
System.out.println(sum);
*/

        //assignment week 1 4

        /*int n=s.nextInt();
        int r; int result=0;
        while (n != 0) {
            r = n % 10;
            result += Math.pow(r, 3);
            n /= 10;
            }

            if (result!=n){
                int a = 0;

                System.out.println(a);}

         */
        }
    }


