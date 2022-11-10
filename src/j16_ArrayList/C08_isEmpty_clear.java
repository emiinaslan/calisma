package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_isEmpty_clear {
    public static void main(String[] args) {


        ArrayList<String> listSehir = new ArrayList<>(List.of("münih", "losangelas", "londra", "stokholm", "ankara", "konya"));
        System.out.println("listSehir = " + listSehir);

        System.out.println("listSehir.isEmpty() = " + listSehir.isEmpty());

        listSehir.clear();//list temizlendi

        System.out.println("listSehir = " + listSehir);
        System.out.println("listSehir.isEmpty() = " + listSehir.isEmpty());


    }
}
