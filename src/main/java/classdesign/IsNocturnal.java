package classdesign;

public interface IsNocturnal  {
    boolean sleepAtnight = false;

    boolean IsNoct();
    public default int getMaxSpeed(){
        return 6;
    }
    static int getTimeToSleep(){
        return 6;
    }
}
