package methods.encapsulation;

public class Reptile extends Animal {
    public boolean isColdBlood() {
        return isColdBlood;
    }

    public void setColdBlood(boolean coldBlood) {
        isColdBlood = coldBlood;
    }

    private boolean isColdBlood;

    public Reptile(String species, boolean canHop, boolean canSwim, int age,boolean isColdBlood) {
        super(species, canHop, canSwim, age);
        this.isColdBlood = isColdBlood;
    }
}
