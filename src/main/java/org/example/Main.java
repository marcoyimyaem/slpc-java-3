package org.example;

/**
 *
 * this {@link Main} is just a sample for fields, methods, and comment types
 * @author marco yimyaem
 */
public class Main {
    int x;
    public static void main(String[] args)
    {
        // x is the current year
        int y = 2024;
        System.out.println("Hello world! "+y);
        System.out.println(greet("Marco"));

       /* System.out.println("Hello world! "+y);
        *System.out.println(greet("Marco"));
         */
    }
    // greet a persons name when the program runs
    public static String greet(String name){
        return "Hello "+name+" welcome to programming java nc III";
    }
}