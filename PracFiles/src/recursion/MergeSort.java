package recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
            int[] arr = {5,4,3,2,1};
            mergeSortInplace(arr, 0, arr.length );
            System.out.println(Arrays.toString(arr));

       // System.out.println(Arrays.toString());
    }

    public static int[] mergeSort(int[] arr){

        //base condition - if the length is one then return array
        if(arr.length == 1){
            return arr;
        }

        //create two arrays left and rigth representing the two divided arrays

        int mid = arr.length/2;
        int left[] = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int right[] = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] first, int[] second){
        int[] merge = new int[first.length + second.length];

        //declare and initialise three pointer variables
        int i = 0, j = 0, k = 0;
        // i = for first, j = for second, k = for new array merge

        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                merge[k] = first[i];
                i++;
            }else{
                merge[k] = second[j];
                j++;
            }
            k++;
        }

        while(i<first.length){
             merge[k] = first[i];
             i++;
             k++;
        }
        while(j<second.length){
            merge[k] = second[j];
            j++;
            k++;
        }
    return merge;
    }


    public static void mergeSortInplace(int[] arr, int s, int e){
        if(e - s == 1)
            return;

        int m = s + (e-s)/2;
        mergeSortInplace(arr, 0,m );
        mergeSortInplace(arr, m , e);

        mergeSort(arr, s , m , e);
    }

    public static void mergeSort(int[] arr, int s, int m, int e){
        int[] mix = new int[e - s];

        int i = s, j = m, k = 0;

        while(i<m && j<e){
            if(arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        //this funciton doesn't return anything so we will change the value of arr here itself
        for (int x = 0; x < mix.length; x++) {
            arr[s + x] = mix[x];
        }

    }
}
