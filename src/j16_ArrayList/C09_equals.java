package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_equals {
    public static void main(String[] args) {
        //--> equals();-> iki listin index ve eleman eşitliği montrol eder true/false return
        List<String>lis1=new ArrayList<>(Arrays.asList("a","b"));
        List<String>lis2=new ArrayList<>(Arrays.asList("A","b"));
        List<String>lis3=new ArrayList<>(Arrays.asList("a","b"));
        List<String>lis4=new ArrayList<>(Arrays.asList("b","a"));


        System.out.println("lis1.equals(lis3) = " + lis1.equals(lis3));
        System.out.println("lis2.equals(lis3) = " + lis2.equals(lis3));
        System.out.println("lis1.equals(lis2) = " + lis1.equals(lis2));
        System.out.println("lis1.equals(lis4) = " + lis1.equals(lis4));

    }//
}
