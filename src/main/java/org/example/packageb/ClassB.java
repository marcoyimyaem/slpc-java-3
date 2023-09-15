// package,imports,class, fields/variables, methods
package org.example.packageb;
import org.example.packagea.ClassA;
public class ClassB {
    String name = "ffff";
    { System.out.println("ini block class b");}

    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassA c = a;

        a.x=100;
        a.x-=20;
        c.x+=30;

//        a=null;
//        a.x+=100;
        c.x+=100;
        System.out.println("mr. "+args[0] +" hp remaining: "+c.x );
        { System.out.println("curly block class b");}
        System.out.println("class b");
//        1==true;
        a.difoftwonumbers(3,1);
        a.sumoftwonumbers(1,5);
        System.out.println(a.name);
        ClassA z = new ClassA(32);
        ClassB b = new ClassB();


        // Monster m1 = Monster();


    }
}
