package functions;

import java.util.Arrays;

public class Change_Value {
    public static void main(String[] args) {
        //create an array

        int[] arr={1,3,2,45,6};
        Change(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Change(int[] nums){
        nums[0] = 99;
    }
//    This function changes the value of array coz arrays are objects and objects are not passed by value exactly
//    are copied i.e a new object is not created rather the same object is copied and reused, both variables here point
//     to the same array. Hence, when we try to change value of one of these the vakue of other also changes.
}
