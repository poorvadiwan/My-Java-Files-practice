package recursion;

public class linearSearch {
    public static void main(String[] args) {
        int arr[] = {4,5,33,66,5,4,7,63,43,543,5432};
        int target = 7;
        linear_search(0,target, arr);
    }
    public static void linear_search(int index, int target, int[] arr){
        if(index == arr.length){
            System.out.println("The target is not in the array.");
            return;
        }
        if(arr[index] == target){
            System.out.println("The target is present at index cd d;"+index);
            return;
        }
        linear_search(index+1, target, arr);
    }
}
