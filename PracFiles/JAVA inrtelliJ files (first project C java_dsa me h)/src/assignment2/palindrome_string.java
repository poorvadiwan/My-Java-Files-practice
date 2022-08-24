package assignment2;

import java.util.Locale;
import java.util.Scanner;

public class palindrome_string {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");

        String a = in.next();

        a = a.toLowerCase();
        int i=0, j=a.length()-1;
        boolean ans=true;
        while(i<j){
            if(a.charAt(i) == a.charAt(j)){
                ans = true;
            }
            else {
                ans = false;
            }
            --j;
            ++i;
        }
        if(ans){
            System.out.println("The string is a palindrome");
        }
        else {
            System.out.println("The string is not a palindrome");
        }
    }
}
