package org.example;

public class VargArgs {
    static int addAllIntVarArgs(int... nums){
        int result = 0;
        for(int num:nums){
            result+=num;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(addAllIntVarArgs(1,2,3,4,5,6,7,8,9,10));
    }
}
