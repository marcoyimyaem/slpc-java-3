package classdesign;

public abstract class Animal {
    protected int age;
    protected String name;
    public void eat(){
        System.out.println("Animal is eating");
    }
    public abstract String getName();
    public abstract void setName(String name);
//    public abstract String getName(){}
//public abstract String getName(){
//    return "G";
//}
    public abstract int getAge();
}
