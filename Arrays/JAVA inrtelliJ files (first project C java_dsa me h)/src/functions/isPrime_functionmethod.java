package functions;

import java.util.Scanner;

public class isPrime_functionmethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = input.nextInt();
        boolean a = isPrime(n);
        System.out.println(a);
        // System.out.println(isPrime(num));
    }

    // SQuaRE ROOT METHOD:-

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; //agr number is less than 1 toh prime hi hoga
        }
         int c = 2;
        while( c*c <= num) {
            if (num % c == 0) {
                return false;

            }
            else {
                return true;
            }
        }
        c++;

             return(c*c>2);
        /*
        if(c*c>2){
        return false;
        }
          return true;
         */

             //so this basically can return two values namely true and false toh agr given statement is true then we
            // get true else false.
        }
    }

