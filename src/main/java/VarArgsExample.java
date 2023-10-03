public class VarArgsExample {

//    addAllInt(int a,int c,int d,String aa, int... b) ✅
//void addAllInt(int a,int c,int d,String... aa, int... b){} ❎
    public int addAllInt(int... x){
        int y = 0;
        for (int z:x) {
            y+=z;
        }
        return  y;
    }

    public static void main(String[] args) {
        VarArgsExample e1 = new VarArgsExample();

    }
}
