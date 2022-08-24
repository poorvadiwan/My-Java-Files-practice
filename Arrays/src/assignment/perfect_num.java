package assignment;
import java.util.Scanner;

// Definition of perfect numbers
// These numbers are the sum of their power divisors
// example - 6 = 1+2+3



public class perfect_num {
    public static void main(String[] args) {
        System.out.println("Perfect Number");
        System.out.println("Enter any number:");
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int sum=1;
        for (int c = 2; c < num; c++) {
        if (num % c == 0) {
        sum = sum+c;
    }
        }
        if (sum==num){
            System.out.println("its a perfect number");
        }
        else{
            System.out.println("not a perfect number");
        }

    }
}
