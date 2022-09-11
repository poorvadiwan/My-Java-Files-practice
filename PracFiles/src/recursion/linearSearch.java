package recursion;

import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        int arr[] = {4,5,33,66,5,4,7,63,43,543,5432};
        int target = 7;
        linear_search(0,target, arr);
        linear_search_last(arr.length-1, target, arr);

        //test for find all indexes
        int arr1[] = {3,4,2,2,5,3,4,123,4,1};
        find_All_indexes(0,4,arr1);
        System.out.println(list);
    }

    public static void linear_search(int index, int target, int[] arr){
        if(index == arr.length){
            System.out.println("The target is not in the array.");
            return;
        }
        if(arr[index] == target){
            System.out.println("The target is present at index "+index);
            return;
        }
        linear_search(index+1, target, arr);
    }

    public static void linear_search_last(int index, int target, int[] arr){
        if(index == -1){
            System.out.println("The target is not in the array.");
            return;
        }
        if(arr[index] == target){
            System.out.println("The target is present at index "+index);
            return;
        }
        linear_search_last(index-1, target, arr);
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void find_All_indexes(int index, int target, int[] arr){
        if(index == arr.length ){
            return;
        }

        if(arr[index] == target){
            list.add(index);
        }
        find_All_indexes(index+1, target, arr);
    }
}
