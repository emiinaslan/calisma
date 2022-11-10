package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task07 {
    public static void main(String[] args) {

        List<String> listİsim = new ArrayList<>(Arrays.asList("umit", "emin", "kemal", "kerem", "taylan", "orhan", "sinan", "furkan", "ahmet", "ali"));
        System.out.println("listİsim = " + listİsim);
        String str1 = listİsim.get(2);
        String str2 = listİsim.get(7);

        listİsim.set(2, str2);
        listİsim.set(7, str1);
        System.out.println("listİsim = " + listİsim);

    }
}
