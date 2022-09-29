package recursion.strings;
import java.lang.String;

public class remove_a {
    // remove all the a's in the given string

    public static void main(String[] args){
        char ch = 'o';
        skip("", "poorva", ch);
       String ans = skip2("diwan", 'a');
       System.out.println(ans);
    }

    private static void skip(String p, String up, char ch) {

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        if(up.charAt(0) == ch ){
            skip(p, up.substring(1) , ch);
        } else {
            skip(p+ up.charAt(0), up.substring(1), ch);
        }
    }

    private static String skip2(String up, char ch) {
        if(up.isEmpty()){
            return "";
        }
        String ans = " ";

        if(up.charAt(0) == ch ){
           ans = skip2(up.substring(1), ch);
        }else{
            ans = up.charAt(0) + skip2(up.substring(1), ch);
        }

        return ans;
    }
    }
