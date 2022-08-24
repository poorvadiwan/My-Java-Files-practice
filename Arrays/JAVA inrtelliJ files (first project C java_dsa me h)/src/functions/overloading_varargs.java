package functions;

import java.util.Arrays;

public class overloading_varargs {

    /*
    During overloading we cannot put a function without parameters that would be wrong coz without parameters pta hi nhi
    chlega ki kaun sa funtion call ho r h.
     */
    public static void main(String[] args) {
        abc(34,4,332,23,3,3,4);
        abc(45,67,"67","My","name","is","Poorva","Diwan");
    }
    static void abc(int ...f){
        System.out.println(Arrays.toString(f));
    }
    static void abc(int r,int c,String ...f){
      //  int b= f.length();

        System.out.println(r);
        System.out.println(Arrays.toString(f));
    }
}
