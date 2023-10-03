package methods.encapsulation;

public class Lion extends Mammal{


    public Lion(String species, boolean canHop, boolean canSwim, int age, boolean canGiveBirth) {

        super(species, canHop, canSwim, age, canGiveBirth);

    }

    @Override
    public void makeSound() {
        System.out.println("WHarrr");
        makeNewSound("Wharrr");
    }

    private void makeNewSound(String wharrr) {
    }

    public static void main(String[] args) {
        Lion nala = new Lion("Mountain Lion",true,false,5,true);
        Object Simba = new Lion("Mountain Lion",true,false,5,true);
//        Lion Mufasa = new Object();
//        Lion Mufasa = new Animal("Mountain Lion",true,false,5);
        nala.makeSound();

        System.out.println(Simba.getClass().getSuperclass().getSuperclass().getSuperclass());
    }
}
class Cat{
    private int age;
    public Cat(){

    }
    public Cat(int x){
        this();
        this.age = x;

    }
    public Cat(int x,int t){
        this();
    }

    public static void main(String[] args) {
        Cat cat = new Cat(21);
        System.out.println(cat.age);
    }
}