package org.example.packagea;

import org.example.packageb.ClassB;

public class ClassA {
    public String name = "I'm Class A";
    public int x = 0;
    public ClassA() {
        x=1;
        System.out.println("class A object is now generated");
    }
    public ClassA(int y){
        x=y;
        System.out.println("class A object is now generated where x is = "+y);
    }
    public int sumoftwonumbers(int b,int a){
        return a+b;
    }
    public int difoftwonumbers(int b,int a){
        return a-b;
    }
    public int productoftwonumbers(int b,int a){
        return a*b;
    }

}
