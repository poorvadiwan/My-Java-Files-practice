package recursion;

import java.util.ArrayList;

public class returning_an_arraylist {
    public static void main(String[] args){
        int[] arr = {1,2,34,5,4,32,34,32,3,4543,56,43,4};
        int target = 4;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(linear_search(0, target, arr, list));
    }
    public static ArrayList<Integer> linear_search(int index, int target, int[] arr, ArrayList list){
        if( index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return linear_search( index+1, target, arr, list);
    }
}
