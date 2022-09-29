package recursion.strings;
import java.util.List;
import java.util.ArrayList;

public class SubSet {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subset(arr);
        for(List<Integer> list : ans){
            System.out.println(list);
        }
        //this for loop says for every list in ans print the list

        System.out.println("\n");
        // or else we can also directly do it this way
        System.out.println(ans);
    }

    public static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        //this ads an empty list in the beginning of the list and so we have an empty list for one already

        // we run a for loop for all the numbers in teh array; as have to find subsets for each number
        for(int num : arr){
            // we will take a size of the outer loop and then copy that in our internal loop for the next elements for that subset range to change
            // for example if we have [ ], [1] for one and now we need to find the number of subsets for 2 then those subsets would be
            // [ ]  [1] [2] [1,2]. i.e we have to add 2 to the same number of elements that existed before for 1
            // so we copy those elements in the internal list and add the number num into them. the same goes for 3 and coming ones

            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                // loop runs for the number of elements in the list for previous number and each interation adds the number to the list.
                outer.add(internal);
                // so we add the new list to the outer one
            }
        }

        return outer;
    }
}
