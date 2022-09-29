package recursion.strings;
import java.lang.String;
import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args){
        subsequence(" ","abc");
        System.out.println();
        System.out.println(subsequence2("","abc"));
    }

    static void subsequence(String p, String up){
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }

        char ch = up.charAt(0);

        // okay so what we are doing here is that we are dividing the string in the current step into two parts because we want to take two choices
        // either take the character or delete the character.
        subsequence(p + ch, up.substring(1));
        subsequence(p, up.substring(1));
    }

    static ArrayList<String> subsequence2(String p, String up){

        //dont pass the arraylist as the argument that's easy do it andr


        if(up.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        char ch = up.charAt(0);

        // okay so what we are doing here is that we are dividing the string in the current step into two parts because we want to take two choices
        // either take the character or delete the character.

        ArrayList<String> left = subsequence2(p + ch, up.substring(1));
        ArrayList<String> right = subsequence2(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
