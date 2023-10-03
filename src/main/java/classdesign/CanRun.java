package classdesign;

public abstract interface CanRun {
//    public static final int MinSpeed = 1;
    int MinSpeed = 1;

//    public abstract int getMinSpeed();
    int getMinSpeed();
    public default int getMaxSpeed(){
        return 6;
    }
}
