package methods.encapsulation;

public class Mammal extends Animal{
    public Mammal(String species, boolean canHop, boolean canSwim, int age, boolean canGiveBirth) {
        super(species, canHop, canSwim, age);
        this.canGiveBirth = canGiveBirth;
    }



    public boolean isCanGiveBirth() {
        return canGiveBirth;
    }

    public void setCanGiveBirth(boolean canGiveBirth) {
        this.canGiveBirth = canGiveBirth;
    }

    private boolean canGiveBirth;

}
