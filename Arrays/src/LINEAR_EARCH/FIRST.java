package LINEAR_EARCH;
 import java.util.Scanner;

public class FIRST {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What would you like the size of your array to be?");
        int n = in.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elelments of the array-");
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println("What would you like to search for?");
        int target = in.nextInt();
        System.out.println("The index matching the given request is:"+linear_search(nums,target));
    }
    public static int linear_search( int[] arr, int target){
        //incase the array is empty
           if(arr.length == 0)
            return -1;

        //run a for loop for the rest of it; i.e. to check
        for (int index = 0; index < arr.length ; index++) {
            if(arr[index] == target){
                return index;
            }
        }

        // incase none of the elements in the array match
        // this si executed when the none fo the return statements above gets executed;
        return -1;

    }
}
