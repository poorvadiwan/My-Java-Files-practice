package recursion;

import java.util.Scanner;

public class palindrome {
 /*   public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = in.nextInt();
        if( reverse(num) == num){
            System.out.println("The number is palidrome");
        }else{
            System.out.println("The number is not palindrome");
        }
    }
  */

    public static void main(String[] args){
            int n = 1234554321;
         System.out.println(n == reverse(n));
         }

    public static int reverse( int n){
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }

    public static int helper(int n , int digits){
        if( n%10 == n){
            return n;
        }
        return (n%10)*((int)(Math.pow(10,digits-1))) + helper(n/10,digits - 1);
    }
}
