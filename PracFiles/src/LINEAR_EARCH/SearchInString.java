package LINEAR_EARCH;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {

        //this works even when he string contains space bar

        String str = "jkbjbkjb jkj";
        char target = ' ';
        System.out.println(Search(str,target));

        //whats a toCharArray method?
        System.out.println(Arrays.toString(str.toCharArray()));
        //so basically it breaks the whole thing into arary form and then we can iterate over it that way.
    }
    public static boolean Search(String str, char target){
   // if the string is empty
        if(str.length()==0){
            return false;
        }

   //lets do it using a for each loop but for a for each loop we need something that is in collection continous
    //form so we convert it into a array using the toCharArray method of string
        for (char ch: str.toCharArray()) {
            if(ch == target)
                return true;
        }


   //for searching through each one tof them
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
