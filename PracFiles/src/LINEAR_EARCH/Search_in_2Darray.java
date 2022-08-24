package LINEAR_EARCH;
import java.util.Scanner;

public class Search_in_2Darray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the row and column of your desired 2D array");
        int[][] arr = new int[in.nextInt()][in.nextInt()];
        System.out.println("input the array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("Does it contain 32?");
        int target = 32;
        System.out.println(search(arr,target));

    }

    static boolean search(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if( arr[i][j] == target)
                    return true;
            }
        }
   return false;
    }
}

