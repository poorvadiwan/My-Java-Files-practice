package sorting;

import java.util.Arrays;

public class selection_sort {
    public static void main(String args[]){
        int[] arr = {5,4,3,1,2};
        //selection sort
        //this is for maximum wala case, min wala bhi frame hojayega
        for (int i = 4; i >= 0 ; i--) {
            int max = i;
            for (int j = i-1; j >= 0; j--) {
                if(arr[j]>arr[max]){
                    max = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
