package Bitwise_Operations;

import java.util.Arrays;
import java.util.Scanner;

public class filp_invert_image {
    public static void main(String[] args) {
        int[][] arr =  {{1, 1, 0},
                        {1, 0, 1},
                        {0, 0, 0}};

        for (int i = 0; i<arr.length;i++){
            int j = arr[i].length - 1, k =0;
            while(k!=j){
                int temp = 0;
                //swap
                temp = arr[i][k];
                arr[i][k] = arr[i][j];
                arr[i][j] = temp;

                k++;
                j--;
            }
        }

        //invert

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] ^= 1;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }

}
