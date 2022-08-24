package Arrays_KK;

import java.util.Arrays;
import java.util.Scanner;

// program to swap the indexes of an array

public class array_swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //for predefined array

        /*
        int[] arr = {1,2,3,4,5,6};
        swap(arr, 0,3);
        System.out.println(Arrays.toString(arr));
*/

        //for an user defined array and swap

        System.out.println("Define the size of your array.");
        int a = in.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
      }
 /*       System.out.println("Enter the indexes to be swapped:");
        swap ( arr, in.nextInt(), in.nextInt());
        System.out.println(Arrays.toString(arr));

  */

        System.out.println("reverse");
        reverse(arr , 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    public static void swap(int[] array, int index1, int index2){
        int temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
    }

    static int[] reverse( int[] array, int start, int end){
       while(start<end) {
               swap(array, start, end);
               start++;
               end--;

       }
       return array;
    }
}
