package LINEAR_EARCH;

//find the minimum number in the given array

public class minimum_number {
    public static void main(String[] args) {
        int[] arr =  {-5,4,54,454};
        int min = min(arr);
        System.out.println("The minimum is: " +  min );


    }

    public static int min( int[] arr){
        int min = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(min>arr[i]) {
                 min = arr[i];
            }
    }
        return min;
    }

}
