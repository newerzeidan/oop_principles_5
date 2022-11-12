package class_object;

import java.util.Arrays;

public class Apple_Exercise {
    /*
    Create 3 Apple objects with below info

    apple1
    Red
    0.5
    Sweet

    apple2
    Red
    0.75
    Sweet

    apple3
    Green
    1.0
    Sour

    Print all the objects
     */

    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        /*
        Count how many apple are sweet

        = 2
         */
        System.out.println("\n---Apples in an Array---\n");
            // store apples in an array
        Apple[] apples = {apple1, apple2, apple3};

        // System.out.println(Arrays.toString(apples));
        // System.out.println(apples.length);
        // System.out.println(apples[1]);
        // System.out.println(apples[2].taste);

        int count = 0;
        for(Apple apple : apples){
            if(apple.taste.equals("Sweet")) count++;
        }
        System.out.println(count); // 2
    }
}
