package polymorphism.example.parameter;

public class Alligator extends Reptile{
    public String getName(){
        return getClass().getSimpleName();
    }
}
