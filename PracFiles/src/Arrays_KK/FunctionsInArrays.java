package Arrays_KK;
import java.util.Arrays;
import java.util.Scanner;

public class FunctionsInArrays {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
   //STRING ARRAY
        String[] num = new String[5];
        for (int i = 0; i < num.length; i++) {
            num[i] = in.next();
        }
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));



   //integer array
        int[] a = new int[6];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(a));
        change(a);
        System.out.println(Arrays.toString(a));

    }

    static void change(int[] array){
        array[4] = 67;
        array[3] = 56;
    }

    static void change(String[] array){

        array[4] = "poorva";
    }
}
