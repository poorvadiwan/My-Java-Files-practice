package recursion;
import java.util.ArrayList;

//don't declare the arraylist before or pass it through the argument rather decalre it inside the fucntion
public class arraylist_variation2 {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,4,8};
        int target = 4;
        System.out.println(indexes(0, target, arr));
    }

    public static ArrayList<Integer> indexes(int index, int target, int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> Addfrombelow = indexes(index+1, target, arr);
        list.addAll(Addfrombelow);
        // this adds all
        return list;
    }

}
