package methods.encapsulation;

public class Method1 {
    double force;
    double acceleration;
    double mass;

//    f = m*a , m =f/a, a=f/m
    public double getforce(double mass,double acceleration){
        return mass*acceleration;
    }
    double getmass(double force, double acceleration){
        return force/acceleration;
    }
    double getacceleration(double force, double mass){
        return force/mass;
    }

    public static void methodSample(){

    }
    private static void methodSample2(){
        return;

    }
    protected static void methodSample3(){
        return;

    }
    static void methodSample4(){
        return;

    }
     final static public void methodSample5(){

    }

    public static void main(String[] args) {
        methodSample();
        Method1 m1 = new Method1();
        System.out.println(m1.getforce(4.5,500)+" N");
    }
}
