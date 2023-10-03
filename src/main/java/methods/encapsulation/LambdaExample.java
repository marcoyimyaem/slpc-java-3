package methods.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("\uD83C\uDF63",false,true,2));
        animals.add(new Animal("\uD83E\uDD98",true,false,14));
        animals.add(new Animal("\uD83D\uDC07",true,false,5));
        animals.add(new Animal("\uD83D\uDC22",false,true,30));
        animals.add(new Animal("\uD83D\uDC38",true,true,6));
//        print(animals, new CheckIfHopper());
//        print(animals, a -> a.canHop());
//        print(animals, a -> a.canSwim());
//        print(animals, a -> a.canSwim() && a.canHop());
//        print(animals, a -> !a.canSwim());
        print(animals, a -> a.canHop() || a.canSwim());
//        print(()->true); // o parameter
//        print(a->a.startsWith("Tur")); // 1 parameter
//        print((Animal a)->a.startsWith("Tur")); // 1 parameter
//        print((a,b)->a.startsWith("Tur")); // 2 parameter
//       ✅ print((String a,String b)->a.startsWith("Tur")); // 2 parameter
//        print(a,b ->a.startsWith("Tur")); // ❎
//        print(a ->{a.startsWith("Tur");}); // ❎
//        print(a ->{ return a.startsWith("Tur")} ); ❎
//        (a,b) -> { int a = 0; return b;} ❎

    }
    private static void print(List<Animal> animals, Predicate<Animal> checker){
        for (Animal animal:animals){
            if(checker.test(animal))
                System.out.print(animal+ ", ");
        }
        System.out.println();
    }
}
