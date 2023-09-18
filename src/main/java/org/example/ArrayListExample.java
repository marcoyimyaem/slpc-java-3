package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> ulam = new ArrayList<>();
        ulam.add("Adobo");
        ulam.add("Adobo");
        ulam.add("Bopis");
        ulam.add("Sinigang");
        ulam.add("Tinola");
        ulam.add("Adobo");
        ulam.add("Adobo");

//        ulam.add(1); error
        ulam.add(2,"Maling");
        System.out.println(ulam.add("Egg"));
        System.out.println(ulam.remove("Adobo"));
        System.out.println(ulam);
        String[] animes = {"one piece","jujutsu kaizen","naruto","zenki","Baki","doraemon","zachbell","Bleach"};
        List<String> ls = Arrays.asList(animes);


    }
}
