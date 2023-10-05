package exceptions.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        try {
//            System.out.println(args[0]);
//            System.out.println(args[1]);
            Scanner input = new Scanner(System.in);
            int x =  input.nextInt();
//            throw new RuntimeException("ARAYYY");
        }
        finally {
            System.out.println("Finally runs");

        }
        System.out.println("program close");
    }
}
