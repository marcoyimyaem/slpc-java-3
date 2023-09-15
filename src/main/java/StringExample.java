public class StringExample {
    public static void main(String[] args) {
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2);
        String anim = "animals";
//        System.out.println(anim.charAt(7));
        System.out.println("\t   a   bv   c   \n hjdfhjj ".trim());
        String a = "";
        a+=2;
        a+='c';
        a+=false;
        if(a=="2cfalse")
            System.out.println("==");
        if(a.equals("2cfalse"))
            System.out.println("equals");
        StringBuilder aa = new StringBuilder("abc");
        StringBuilder b = aa.append("de");

        b = b.append("f").append("g");
        System.out.println("a=" + aa);
        System.out.println("b=" + b);

    }
}
