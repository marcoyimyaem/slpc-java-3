package methods.encapsulation;

public class Animal {
    public void makeSound(){
        System.out.println("make Animal sound");
    }
    @Override
    public String toString() {
        return species;
    }

    public static void main(String[] args) {
        Animal simba = new Animal("Lion",true,false,5);
        System.out.println(simba.species);
    }
    private String species;
    private boolean canHop;
    private boolean canSwim;
    private int age;

    public Animal(String species, boolean canHop, boolean canSwim,int age) {
        this.species = species;
        this.canHop = canHop;
        this.canSwim = canSwim;
        this.age = age;
    }

    public boolean canHop(){
        return this.canHop;
    }
    public boolean canSwim(){
        return this.canSwim;
    }
    public int getAge(){
        return this.age;
    }
}
