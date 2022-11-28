package day5;

import java.util.HashMap;
import java.util.Map;

public class Q01_MapKeysValues {
    public static void main(String[] args) {
        HashMap<String, Integer> ulke = new HashMap<>();
        ulke.put("Almanya", 80);
        ulke.put("Türkiye", 83);
        ulke.put("Amerika", 250);
        ulke.put("Fransa", 70);
        ulke.put("Kanada", 40);

        System.out.println("ülke isimleri ve nufusları\n" + ulke + "milyondur");
        System.out.println("ülke isimleri\n" + ulke.keySet());
        System.out.println("ülke nüfusları\n" + ulke.values());


        int toplam = 0;
        int ellidenBuyuk = 0;

        for (Integer w : ulke.values()) {
            if (w > 50) {
                ellidenBuyuk++;
            }
        }
        System.out.println(ellidenBuyuk);
        for (Integer w : ulke.values()) {
            toplam += w;
        }
        System.out.println(toplam);

        for (Map.Entry<String,Integer> sıralama : ulke.entrySet()) {
            System.out.println(sıralama);
        }
        for (String ulkeSıra : ulke.keySet()) {
            System.out.println(ulkeSıra);

        }
        for (Integer ulkeNufus : ulke.values()) {
            System.out.println(ulkeNufus);

        }
    }
}
