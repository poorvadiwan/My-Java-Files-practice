package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class insertion_sort {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = in.nextInt();
        System.out.println("Enter an array:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Your array is "+ Arrays.toString(arr));

        //INSERTION SORT
        //ascending order
        int temp = 0;
        for (int i = 0; i <= size-2; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j]<arr[j-1]){
                    //swap
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
        }
        //FOR DESC ORDER
        /*
        if{arr[j]>arr[j-1])
             swap
             else
               break
         */

        //print
        System.out.println(Arrays.toString(arr));
    }
}
