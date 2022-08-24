package Arrays_KK;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int[] array = new int[in.nextInt()];
        System.out.println("Enter the elements of ur arrray");

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Maximum is " + max(array));
        System.out.print("Enter the range please ");
        int start = in.nextInt(), end = in.nextInt();
        System.out.println("maximum is " + maxRange(array, start ,end));
    }

    static int max(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length ; i++) {
            if(array[i] > array[i-1]) {
                max = array[i];
            }
        }
        return max;
    }

    //incase the range is given
    static int maxRange(int[] array, int start, int end){
        int max = array[start];
        for (int i = start; i < end ; i++) {
            if(array[i] > array[i-1]) {
                max = array[i];
            }
        }
        return max;
    }

}

