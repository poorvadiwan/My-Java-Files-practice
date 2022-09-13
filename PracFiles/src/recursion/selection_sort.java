package recursion;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 2, 1, 3};
        sort(arr, arr.length, 0, 0);
        // this will be arr.length because then only the loop will run for 6 times
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int row, int col, int max) {
        if (row == 0) {
            return;
        }
        if(row>col){
            if(arr[col]>arr[max]){
                sort(arr, row, col+1, col);
            }else{
                sort(arr, row, col+1, max);
            }
        }else{
            //swap
            int temp = arr[max];
            arr[max] = arr[row-1];
            arr[row - 1] = temp;
            // we are swapping here because upr we were only finding the maximum but here after the maximum has been found out we are swapping things.
            sort(arr, row-1, 0, 0);
        }
    }
}
