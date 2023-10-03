package polymorphism.example;

public class Lemur extends Primate implements HasTail {
    @Override
    public boolean isTailStriped() {
        return false;
    }
    public int age = 10;

    public static void main(String[] args) {
        Lemur lemur = new Lemur();

        System.out.println(lemur.age);
        System.out.println(lemur.isTailStriped());
        System.out.println(lemur.hasHair());

        HasTail hasTail = new Lemur();
        System.out.println(hasTail.isTailStriped());
//        System.out.println(hasTail.age);

        Primate primate = lemur;

        Primate primate2 = new Primate();
        Object primateobj = primate;
        Lemur primateobj2 = (Lemur) primateobj;
//        HasTail hasTail2 = (HasTail) primate2;
        Lemur primate3 = (Lemur) primate2;
//        System.out.println(primate.hasHair());
//        System.out.println(primate.age);
//        System.out.println(primate.isTailStripped());
    }
}

//    Here are some basic rules to keep in mind when casting variables:
//1. Casting an object from a subclass to a superclass doesn’t require an explicit cast.
//2. Casting an object from a superclass to a subclass requires an explicit cast.
//3. The compiler will not allow casts to unrelated types.
//4. Even when the code compiles without issue, an exception may be thrown at runtime if
//the object being cast is not actually an instance of that class.

