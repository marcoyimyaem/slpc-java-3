import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VarArgsExampleTest {
    @Test
    public void testaddAllInt(){
        VarArgsExample test1 = new VarArgsExample();
        int result = test1.addAllInt();
        assertEquals(0,result);

    }
    @Test
    public void testaddAllInt2(){
        VarArgsExample test1 = new VarArgsExample();
        int result2 = test1.addAllInt(5);
        assertEquals(5,result2);

    }
    @Test
    public void testaddAllInt3(){
        VarArgsExample test1 = new VarArgsExample();
        int result3 = test1.addAllInt(1,2,3,4,5,6,7,8,9,10);
        assertEquals(55,result3);

    }



}