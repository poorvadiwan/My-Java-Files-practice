package sorting;

import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int arr1[] = {6,5,4,3,2,1};
    }

    public static void sort(int[] arr,int low,int high){
        if(low>=high)
            return;

        int s = low;
        int e = high;
        int mid = s + (e-s)/2;

        int pivot = arr[mid];

        while(s <= e){
            while(arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot)
                e--;

            if(s<=e){
                //swap the two indices
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
            }
        }

        sort(arr, low, e);
        sort(arr, s, high);
    }
}
