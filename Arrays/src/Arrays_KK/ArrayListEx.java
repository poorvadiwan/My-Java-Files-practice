package Arrays_KK;

import java.util.ArrayList;


public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);

        // the before hand initailization of the size is of no matter or use later, we cam add as many as we want
    //Syntax:-
    // ArrayList<Datatype> name = new ArrayList<>(size);
    //Datatype cant be primitive it hass to be a wrapper class.
    // in the later context its not necessary to write daatatype there.

        //to add an element ot this we use list class ka add function

        list.add(45);
        list.add(432);
        list.add(4);
        list.add(43);
        list.add(9);
        list.add(2);
        list.add(5);
        list.add(2);
        list.add(5);
        list.add(2);
        list.add(4);
        list.add(42);
        list.add(4);
        list.add(42);


        //list.contains
        // this function tells us whetther the list contains a particular value or not; the output is in boolean
        System.out.println(list.contains(45));

        System.out.println(list); //we are directly adding list here and not Arrays.toString method becaouse arraylist ke
                                  // output method me hi ye tareeka defined hai and vo internally toString lga ke hi value
                                  //  uthata hai


        //Upadate(set) funtion
        // this updates whichever index we want to update
        list.set(2,90);
        list.set(1,34);
        list.set(0,332);
        //so these three sets the value of 2,1 and 0th index of the list ot the respective values.

        System.out.println(list);

        //Remove function
        list.remove(3);
        //this removes the element currently at index 3 and then installs the element at index 4 there
        System.out.println(list);
    }
}
