
package functions;

public class shadowing {
    static int a =45; //this value is overshadowed at line 9 coz we have defined a new variable at line 8
    // this is called overshadowing - isme apn do same variables rlhte ahi but ek dusre ke andr and then meeche wala upr
// wale ko overshadow krr deta h.
    public static void main(String[] args) {
        System.out.println(a);//45
        int a;
        //System.out.println(a);

        /* We cant use a here coz untill this point it hasnot been intialised we can access it after the next line
        #The over riding of global varaible by local one is only possible if and only if we have initialised it
         somewhere before.
         */

        a = 40;
        System.out.println(a);//40
        fun();
    }
    static void fun(){
        System.out.println(a);//45
    }
}
