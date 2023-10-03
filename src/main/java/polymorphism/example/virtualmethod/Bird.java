package polymorphism.example.virtualmethod;

public class Bird {
    public String getName(){
        return "Unknown";
    }
    public void displayInformation(){
        System.out.println("the bird name is: "+getName());
    }
}
