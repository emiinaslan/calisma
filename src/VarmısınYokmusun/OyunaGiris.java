package VarmısınYokmusun;

import java.util.ArrayList;
import java.util.Collections;

public class OyunaGiris {
    static ArrayList<Integer>paraListesi=new ArrayList<>();

    public static void main(String[] args) {
        paraListesi.add(1);
        paraListesi.add(10);
        paraListesi.add(500);
        paraListesi.add(1000);
        paraListesi.add(5000);
        paraListesi.add(10000);
        paraListesi.add(50000);
        paraListesi.add(100000);
        paraListesi.add(250000);
        paraListesi.add(500000);
        Collections.shuffle(paraListesi);

        kutularıOlustur();

    }

    private static void kutularıOlustur() {
    }
}
