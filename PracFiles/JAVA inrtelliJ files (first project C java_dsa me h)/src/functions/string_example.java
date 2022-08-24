package functions;

import java.util.Scanner;

public class string_example {
    public static void main(String[] args) {
//        String x = hello();
//        System.out.println(x);

        //You dont want predesigned message for yourself and you also want to wrtie input stream outside fucntion:-
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name : ");
        String name = input.nextLine();
        String personalized_message = greet2(name);
        System.out.println(personalized_message);



        // This can also be done as:-
//        String personalised_message = greet2("Poorva Diwan");
//        System.out.println(personalised_message);
    }

    public static String greet2(String name){
        String message = "Hello "+name;
        return message;
    }
//    private static String hello(){
//        Scanner in = new Scanner(System.in);
//        System.out.println("Please enter a message:");
//        String message = in.nextLine();
//        return message;
//    }

}


