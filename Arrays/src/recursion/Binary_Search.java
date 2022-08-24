package recursion;

import java.util.Arrays;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,66,77,88,99,654,4543};
        int target = 6;
        System.out.println(binary(arr, target, 0, (arr.length)-1));
    }

    public static int binary(int[] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }

        int mid = start + (end-start)/2;

        if(target == arr[mid]){
            return mid;
        }

        if(target<arr[mid]){
            return binary(arr, target, start , mid-1);
        }
        return binary(arr, target, mid+1, end);
    }
}
