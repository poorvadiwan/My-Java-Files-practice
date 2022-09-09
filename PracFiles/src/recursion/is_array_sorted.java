package recursion;

// This program works only for array sorted in ascending order
public class is_array_sorted {
    public static void main(String[] args){
        int arr[] = {1,3,5,6,7,8,9};
        is_sorted(0,arr);
    }

    public static void is_sorted(int index,int[] arr){
        if(index == arr.length-1){
            System.out.println("The array is sorted");
            return;
        }

        if(arr[index]>arr[index+1]){
            System.out.println("The array is not sorted");
            return;
        }
        is_sorted(index+1,arr);
    }
}
