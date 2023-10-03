package classdesign;

public class Swan extends Mammal implements CanRun,IsNocturnal{
//    public abstract void swim();

    public static void main(String[] args) {
//        Animal anim = new Animal();
        Swan sw1n = new Swan();
        System.out.println(IsNocturnal.getTimeToSleep());
//        sw1n.sleepAtnight = true;
        sw1n.getMaxSpeed();
        Animal swan = new Swan();

    }

    @Override
    public String getName() {
        return null;
    }
    public String msg(){
        return "";
    }
    public String msg(String x){
        return x;
    }
    public int msg(int x){
        return 1;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public boolean isCanGaveBirth() {
        return false;
    }

    @Override
    public int getMinSpeed() {
        return 0;
    }

    @Override
    public boolean IsNoct() {
        return false;
    }

    @Override
    public int getMaxSpeed() {
        return CanRun.super.getMaxSpeed();
    }



}
//    Abstract Class Definition Rules:
//        1. Abstract classes cannot be instantiated directly.
//        2. Abstract classes may be defined with any number, including zero, of abstract and nonabstract methods.
//        3. Abstract classes may not be marked as private or final.
//        4. An abstract class that extends another abstract class inherits all of its abstract methods
//        as its own abstract methods.
//        5. The first concrete class that extends an abstract class must provide an implementation
//for all of the inherited abstract methods.
//        Abstract Method Definition Rules:
//        1. Abstract methods may only be defined in abstract classes.
//        2. Abstract methods may not be declared private or final.
//        3. Abstract methods must not provide a method body/implementation in the abstract
//class for which is it declared.
//        4. Implementing an abstract method in a subclass follows the same rules for overriding a
//        method. For example, the name and signature must be the same, and the visibility of
//        the method in the subclass must be at least as accessible as the method in the parent
//class

//    Defining an Interface
//
//        1. Interfaces cannot be instantiated directly.
//        2. An interface is not required to have any methods.
//        3. An interface may not be marked as final.
//        4. All top-level interfaces are assumed to have public or default access, and they must
//        include the abstract modifier in their definition. Therefore, marking an interface as
//private, protected, or final will trigger a compiler error, since this is incompatible
//        with these assumptions.
//        5. All nondefault methods in an interface are assumed to have the modifiers abstract
//and public in their definition. Therefore, marking a method as private, protected,
//        or final will trigger compiler errors as these are incompatible with the abstract and
//public keywords.

//    Inheriting an Interface
//        There are two inheritance rules you should keep in mind when extending an interface:
//        1. An interface that extends another interface, as well as an abstract class that
//        implements an interface, inherits all of the abstract methods as its own abstract
//methods.
//        2. The first concrete class that implements an interface, or extends an abstract class
//that implements an interface, must provide an implementation for all of the inherited
//abstract methods

//    Interface Variables
//    1. Interface variables are assumed to be public, static, and final. Therefore, marking
//    a variable as private or protected will trigger a compiler error, as will marking any
//    variable as abstract.
//    2. The value of an interface variable must be set when it is declared since it is marked as
//final.

//default interface  method rules
//
//1. A default method may only be declared within an interface and not within a class or
//abstract class.
//2. A default method must be marked with the default keyword. If a method is marked as
//default, it must provide a method body.
//3. A default method is not assumed to be static, final, or abstract, as it may be used
//        or overridden by a class that implements the interface.
//4. Like all methods in an interface, a default method is assumed to be public and will not
//        compile if marked as private or protected.

//public interface Carnivore {
//    public default void eatMeat(); // DOES NOT COMPILE
//    public int getRequiredFoodAmount(); { // DOES NOT COMPILE
//        return 13;
//    }
//}

//    Here are the static interface method rules you need to be familiar with:
//        1. Like all methods in an interface, a static method is assumed to be public and will not
//        compile if marked as private or protected.
//        2. To reference the static method, a reference to the name of the interface must be used