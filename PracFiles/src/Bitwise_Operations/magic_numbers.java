package Bitwise_Operations;
import java.util.Scanner;
import static java.lang.Math.pow;

public class magic_numbers {
    public static void main(String[] args){
        //find the nth magic number
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n");
        int i =1, num = in.nextInt(), ans=0;
        while(num>0){
            ans+=(num&1)*pow(5,i);
            num>>=1;
            i++;
        }
        System.out.println("Magic number is "+ans);
    }
}
