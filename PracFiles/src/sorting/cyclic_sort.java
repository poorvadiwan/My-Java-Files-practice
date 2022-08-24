package sorting;
import java.util.Scanner;
import java.util.Arrays;

public class cyclic_sort {
    public static void main(String args[]) {
       /* Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of your array:");
        int size = in.nextInt();
        System.out.println("Enter your array:");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        */


        int[] arr = {5,4,3,2,1};
        int i = 0;
        while(i< arr.length){
            int correct = arr[i] - 1;
            if(arr[i]!=arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
