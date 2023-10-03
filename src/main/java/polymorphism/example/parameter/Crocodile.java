package polymorphism.example.parameter;

public class Crocodile extends Reptile{
    public String getName(){
        return getClass().getSimpleName();
    }
}
