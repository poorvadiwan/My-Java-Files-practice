package functions;
import java.util.Arrays;
//import java.awt.image.AreaAveragingScaleFilter;

public class variable_lenght_arguements {
    public static void main(String[] args) {
      VarArgs(5,4,3,2,3,3,23,3);
     // multiple(4,32,5,5,5,55,6);
        fun("Poorva", 55,3,43,45,6,3,14354,66,4,6);
    }

    static void fun(String a, int ...g){

        System.out.println("String is :"+a);
        System.out.println("Number of arguements is:" + g.length);

        for( int i:g){
            System.out.print(i + " ");
        }
    }
    static void multiple(int a, int b, int ...r){
        System.out.println(a);
        System.out.println(b);
        System.out.println(r);
    }

    static void VarArgs(int ...a){
        System.out.println(Arrays.toString(a));
    }

}
