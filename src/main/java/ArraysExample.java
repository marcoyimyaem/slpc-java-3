import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int [] ids = {5,1,4,2,4},type = {1,2,3,4};
        int ids2 [] = {1,2,3,4}, type2 = 1;
        String[] animes = {"one piece","jujutsu kaizen","naruto","zenki","Baki","doraemon","zachbell","Bleach"};
        Arrays.sort(animes);
        for(String anime: animes)
           System.out.println(anime);
        System.out.print(animes);
        System.out.print("");
        System.out.println();
        String[] strings = { "}","10", "9","62","-10", "100" };
        Arrays.sort(strings);
        for (String string : strings)
            System.out.print(string + " ");
        System.out.println();
        int [] nums1 = {100,148,20,87,1,3,5,21,7,9,12,20,42,45,61,99};
        Arrays.sort(nums1);
        for (int nums1s : nums1)
            System.out.print(nums1s + " ");
        System.out.println("located @:"+Arrays.binarySearch(nums1,102));
    }
}
