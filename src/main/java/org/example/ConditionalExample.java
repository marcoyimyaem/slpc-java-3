package org.example;

import java.time.Month;
import java.util.Scanner;

public class ConditionalExample {
    public static void main(String[] args) {
        Scanner time1 = new Scanner(System.in);
        System.out.println("Enter Time: ");
        int hoursOfDay = time1.nextInt();
        if(hoursOfDay < 12) {
            System.out.println("Good morning");
        }else if(hoursOfDay < 18) {
            System.out.println("Good Afternoon");
        }else {
            System.out.println("Good evening kumain kana ba?");
        }
        Scanner askinput = new Scanner(System.in);
        System.out.println("would you like to continue? Y or N");
        String ask = askinput.nextLine();
        switch (ask){
            default: System.out.println("Invalid input");
            case "y":
            case "Y": System.out.println("coming soon");
                        break;
            case "n":
            case "N": System.out.println("see us again");
                        break;

        }
//        (booleanExpression) ? T: F;
        int age = 11;
        boolean ageask = age>=18;
        System.out.println( (ageask) ? "access granted":"access denied" );


    }
}
