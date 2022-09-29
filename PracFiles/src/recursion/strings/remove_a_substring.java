package recursion.strings;
import java.lang.String;

public class remove_a_substring {
    //remove a substring from the given string
    public static void main(String[] args) {
        System.out.println(skipstring("poorvaeatsappleanditstoogood","apple"));
        System.out.println(skipstringApp("poorvaeatsappandappleanditstoogood"));
    }

    public static String skipstring( String str, String substr){
        if(str.isEmpty()){
           return "";
        }
        String ans = "";
        if(str.startsWith(substr)){
            ans = skipstring(str.substring(substr.length()), substr);
        }else{
            ans = str.charAt(0) + skipstring(str.substring(1),substr);
        }
        return ans;
    }

    // skip app but  not apple mtlb age app aata hai toh skip it but agr apple aata hai toh don't do anything.
    public static String skipstringApp( String str){
        if(str.isEmpty()){
            return "";
        }
        String ans = "";
        if(str.startsWith("app") &&  !str.startsWith("apple")){
            ans = skipstringApp(str.substring(3));
        }else{
            ans = str.charAt(0) + skipstringApp(str.substring(1));
        }
        return ans;
    }
}
