package Bitwise_Operations;

public class find_one_in_three {
    static final int size = 32;

    public static void main(String[] args){
        int arr[] = {2,2,3,2,7,7,8,8,8,7};
        System.out.println("The number occuring only once is " + find_num(arr,arr.length));
    }

    public static int find_num(int[] arr, int n){
        int result = 0, mask, sum;

        //iterate through every bit
        for (int i = 0; i < size; i++) {
            sum=0;
            mask = 1<<i;
            //find sum at ith position
            for (int j = 0; j < n; j++) {
                if((arr[j] & mask) == 1)
                    sum++;
            }

            //check: if sum isn't the multiple of 3

            if((sum%3)!=0){
                result = result | mask;
            }
        }
   return result;
    }
}
