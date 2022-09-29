package recursion.strings;

import java.util.ArrayList;
import java.util.List;

public class DuplicateSubset {

    // incase the subsets are duplicated what to do?
    // ex make subsets of {1,2,2}
    // [], [1], [2] [1,2] [2] [1,2] [2,2], [1,2,2] here we have two repeated subsets [2] and [1,2]. these are repeated coz we multiplied 2 twice with the
    // the subsets of 1. Hence we nneed to avoid it in order to avoid the duplicates

    //NOTE: whenever you find a duplicate subset add the number to the newly created subset in the previous step
    // but the above note holds true if and only if the duplicates are adjacent to each other so in order to make them adjacent we need to sort teh array

    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List<List<Integer>> ans = subset(arr);
        for(List<Integer> list : ans){
            System.out.println(list);
        }
    }

    // we need to take two pointers start and end in order ot keep track of the indices of the two lists outer and internal
    public static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        int start = 0,end = 0;
        outer.add(new ArrayList<>());
        int n = outer.size();
        for (int j = 0; j < arr.length; j++) {
            // if curre t and previous element is same then start = end - 1
            if( j>0 && arr[j]==arr[j-1]){
                start = end -1;
            }
            end = outer.size() - 1;

            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(arr[j]);
                outer.add(internal);
            }
        }
        return outer;
}
}


