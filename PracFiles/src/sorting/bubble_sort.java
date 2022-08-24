package sorting;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
      int[] arr = {};
      bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void  bubble(int[] arr){
        boolean ifSwapped;
        //this is for the best case i.e. the array is sorted so instead of running the loop for n rimes we can run it only
        // once since: the array is swapped if none of the calues of j is swapped
        //not just for the best case but for intermediate cases too
        for (int i = 0; i < arr.length; i++) {
            ifSwapped = false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j] < arr[j-1]) {
                    //swap the two numbers
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                    // if swap occured then the value will be true
                    ifSwapped = true;
                }
            }

            // if the value of swapped is false i.e. no swap has occured so !ifSwapped will return true
            // and hence the condition will be satisfied and we'll get out of the loop
            if(!ifSwapped){
                break;
            }
            
        }
    }
}
