package assignment;
import java.util.Arrays;
import java.util.Scanner;

public class zero_based_per {
    public static void main(String[] args){
       /* Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of terms you want your array to have" +
                " \n Warning ***numbers entered " +
                "should be less" +
                "than the length***");
       int a = in.nextInt();
       int[] nums = new int[a];
        System.out.println("enter the array");
        for (int i = 0; i <= nums.length - 1; i++) {
            nums[i] = in.nextInt();
            }


        int[] ans = new int[a];
        for (int j = 0; j <= ans.length - 1; j++) {
            ans[j] = nums[nums[j]];
        }
       System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(ans));
        */
    }
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
