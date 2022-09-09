package Bitwise_Operations;
import java.util.Scanner;

public class BitwiseSQRT {

    //Newton Rampson Method

    public static void main(String[] args) {
        System.out.println("This is a program to calculate the square root of a number");
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
       // System.out.println("Ent" +
       //         "er the precision");
       // int p = in.nextInt();
        System.out.printf("%.3f",root(num));
    }

    public static double root(int num) {
        double root = 0.0;
        // Binary Search
        int s = 0, e = num;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid * mid == num) {
                root = mid;
            }

            if (mid * mid < num) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }

            // precision
            double incr = 0.1; //increment
            for (int i = 0; i < 3; i++) {
                while (root * root < num) {
                    root += incr;
                }
                root -= incr;
                incr /= 10;
            }
            return root;
        }
        return root;
    }
}
