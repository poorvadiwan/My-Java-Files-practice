package Bitwise_Operations;

public class find_num_occuring_once {
    public static void main(String args[]){
        int[] arr = {2,3,4,1,2,1,4,6,3};
        System.out.println("The number occuring once is " + find_single(arr));
    }

    public static int find_single(int[] arr){
        int res = 0;
        for(int i = 0; i<arr.length; i++){
            res = res ^ arr[i];
        }
        return res;
    }
}
