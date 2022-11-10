package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C11_Contains {
    public static void main(String[] args) {
        ArrayList<String> listSehir = new ArrayList<>(List.of("münih", "losangelas", "londra", "stokholm"));
        System.out.println("listSehir.contains(\"angara\") = " + listSehir.contains("angara"));

        System.out.println("listSehir.contains(3) = " + listSehir.contains(3));
        Collections.reverse(listSehir);
        System.out.println("listSehir = " + listSehir);
        //Trick-->reverse yapmak için sorta gerek yok


    }
}
