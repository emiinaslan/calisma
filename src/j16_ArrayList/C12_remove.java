package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C12_remove {
    public static void main(String[] args) {
        ArrayList<String> listSehir = new ArrayList<>(List.of("münih", "losangelas", "londra", "stokholm"));
        //listen istenen istenen elemanı siler
        System.out.println("listSehir.remove(0) = " + listSehir.remove(0));
        System.out.println("listSehir = " + listSehir);
        System.out.println("listSehir.remove(\"münih\") = " + listSehir.remove("londra"));
        listSehir.add("münih");
        listSehir.add("ankara");
        listSehir.add("münih");
        System.out.println("listSehir = " + listSehir);
        System.out.println("listSehir.remove(\"münih\") = " + listSehir.remove("münih"));
        System.out.println("listSehir = " + listSehir);




    }
}
