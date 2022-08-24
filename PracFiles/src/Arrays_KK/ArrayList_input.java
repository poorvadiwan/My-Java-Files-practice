package Arrays_KK;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList_input   {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the number of terms you wish to enter:");
        int n = in.nextInt();
        System.out.println("Enter the elements of the array:-");
        for (int i = 0; i <n; i++) {
            list.add(in.nextInt());
        }
        System.out.println("The array is :"+list);

//ANOTHER INPUT METHOD
        //in order to get the element aat a particular index we do this

        System.out.println("Enter which element you want to see");
        int index = in.nextInt();
        System.out.println(list.get(index));

        // or else in a loop we can do it as
//        for (int i = 0; i < n; i++) {
  //      System.out.println(list.get(i));
//              }


    }
}
