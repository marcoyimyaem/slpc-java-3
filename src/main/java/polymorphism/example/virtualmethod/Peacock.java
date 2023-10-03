package polymorphism.example.virtualmethod;

public class Peacock extends Bird{
    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    public static void main(String[] args) {
        Peacock p1 = new Peacock();
        Bird p2 = new Bird();
        p1.displayInformation();
        p2.displayInformation();

    }
}
