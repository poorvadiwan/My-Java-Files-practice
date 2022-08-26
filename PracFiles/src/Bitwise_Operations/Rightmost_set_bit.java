package Bitwise_Operations;
import java.util.Scanner;

public class Rightmost_set_bit {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int num = in.nextInt();
        System.out.println("The right most set bit is "+Return(num));
    }

    public static int Return(int num){
        int counter = 1;
        while(true){
            if((num & 1)==1){
                return counter;
            }else{
                counter++;
                num>>=1;
            }
        }
    }
}
