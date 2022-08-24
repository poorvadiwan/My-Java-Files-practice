package Bitwise_Operations;
import java.util.Scanner;

public class find_odd_or_even {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("Enter a number");
            int num = in.nextInt();
            if (isOdd(num))
                System.out.println(num + " is odd.");
            else
                System.out.println(num + " is even.");
        }

    }

    public static boolean isOdd(int num){
        return ( num & 1 )==1;
    }

}
