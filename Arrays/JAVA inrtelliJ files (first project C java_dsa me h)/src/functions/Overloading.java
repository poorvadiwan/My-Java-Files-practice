package functions;

public class Overloading {

    //for function overloading either the number of arguements should be differwent or the type of arguements should be
    //different/.
    public static void main(String[] args) {
        function(4);
        function("poorva diwan");
        function(4,4,"New String");
    }
    static void function(int s){
        System.out.println(s);
    }
    static void function(String name){
        System.out.println("String is "+name);
    }
    static void function(int a, int b, String naam){
        System.out.println("first variable "+a+ " second variable "+b+ " the string is : "+naam);
    }
}
