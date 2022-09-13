package recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
            int[] arr = {5,4,3,2,1};
            arr = mergeSort(arr);
            System.out.println(Arrays.toString(arr));
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

}
