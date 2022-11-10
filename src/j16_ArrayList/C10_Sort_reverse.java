package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C10_Sort_reverse {
    public static void main(String[] args) {
        //collection.sort();--> verilen list'i naturel sıralama yapar
        // collections.reverse(list);--> verilen listenin ters sıralaması

        ArrayList<String> listSehir = new ArrayList<>(List.of("münih", "losangelas", "londra", "stokholm"));
        System.out.println("listSehir = " + listSehir);
        Collections.sort(listSehir);
        System.out.println("listSehir = " + listSehir);
        Collections.reverse(listSehir);
        System.out.println("listSehir = " + listSehir);

    }//
}
