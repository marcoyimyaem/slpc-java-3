package org.example;

public class Loopers {
    public static void main(String[] args) {
        int age = 11;
        boolean ageask = age>=18;
//        int x  = (1>2) ? 3 :3.0;
        System.out.println( (ageask) ? "access granted":"access denied" );
        while(age>=0){
            System.out.println(age);
            age--;
        }
//        for()
//            System.out.print("asdasd");
        for(int i=0;i<10;i++)
            System.out.print(i+" ");
        String[] colors = {"red","black","white","pink","green"};
FOR_EACH_SAMPLE:        for(String color:colors){
                            if(color.equals("white"))
//                                break FOR_EACH_SAMPLE;
                                continue FOR_EACH_SAMPLE;
                            System.out.println(color);}

    }
}
