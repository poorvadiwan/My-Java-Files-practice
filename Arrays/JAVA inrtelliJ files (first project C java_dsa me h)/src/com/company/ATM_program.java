package com.company;

import java.util.Scanner;

public class ATM_program {

    public static void main(String[] args) {
        System.out.println("Welcome");
        int ac, pin, dep, tb = 100000000, wa;

        int i;
        for (i = 0; i <= 15; i++) {
            Scanner input1 = new Scanner(System.in);
            System.out.println(input1.nextLine());
            System.out.println("Please enter your account number:");
            ac = Integer.parseInt(input1.nextLine());

            if (ac == 1234) {
                Scanner input2 = new Scanner(System.in);
                System.out.println(input2.nextLine());
                System.out.println("Enter your PIN number:");
                pin = Integer.parseInt(input2.nextLine());


                if (pin == 123) {
                    System.out.println("1.Check Balance");
                    System.out.println("2.Dsp");
                    System.out.println("3.Withdraw");
                    System.out.println("4.Exit");

                    Scanner input3 = new Scanner(System.in);
                    System.out.println(input3.nextLine());
                    System.out.println("Select your choice:");
                    int ch;
                    ch = Integer.parseInt(input3.nextLine());

                    if (ch == 1) {
                        System.out.println("Your balance is " + tb + " Thank You");
                    }
                    if (ch == 2) {
                        Scanner input4 = new Scanner(System.in);
                        System.out.println(input4.nextLine());
                        System.out.println("Enter the amount to be deposited:");
                        dep = Integer.parseInt(input4.nextLine());

                        tb += dep;
                        System.out.println("Your balance is " + tb + "  Thank You");
                    }
                    if (ch == 3) {
                        Scanner input5 = new Scanner(System.in);
                        System.out.println(input5.nextLine());
                        System.out.println("Enter the amount to be withdrawn:");
                        wa = Integer.parseInt(input5.nextLine());
                        if (wa <= tb) {
                            tb -= wa;
                            System.out.println("Your balance is " + tb + " Thank You");
                        } else {
                            System.out.println("You don't have enough balance!");
                        }
                    }
                    if (ch == 4) {
                        System.exit(0);
                    }
                } else {
                    System.out.println("Invalid PIN number.");
                }
            }
            else{
                System.out.println("Invalid account number.  Please try again ");
            }
            i--;
        }
    }
}

