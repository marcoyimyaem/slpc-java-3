package org.example;
import java.util.*;


public class ArrayListExample {
    static int addAllNumbers(int... t){
        int sum = 0;
//        for(int y:t)
//            sum +=y;
        return sum = Arrays.stream(t).sum();
    }
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
//int[] v ={21,33,44,556};
        List<Integer> v = Arrays.asList(21,33,44,556);

        Double num1 = Double.valueOf(56.5);
        System.out.println(num1.intValue());
        Integer s1 = 180;
        Integer s2 = 180;
        System.out.println(s1+s2);
        List<String>list = new ArrayList<>();
        list.add("Robin");
        list.add("Hawk");
        Object[] objectArray = list.toArray();
        String[] stringArray= list.toArray(new String[0]);
        Collections.sort(list);
//        Collections.shuffle();
        System.out.println(list);
        System.out.println("enter a number");
        Scanner input1 = new Scanner(System.in);
        String message = ((input1.nextInt()%2) == 0) ? "Even" : "Odd";
        System.out.println(message);
        System.out.println("the sum is "+addAllNumbers(1,45,5,54,2,5,4,5,65,5,6,6,5,5));
        Integer[] p = {89,34,2,1,4,76};
//        Arrays.stream(p).max();


    }
}


