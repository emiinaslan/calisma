package j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C02_Previous {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(24, 38, 65, 9, 11, 7, 27, 24));
        //l1 elemanlarını tersten print ediniz
        System.out.println("l1 list ilk hali: " + l1);
        /*
        tekrarda son elemandan başlayan işlemler için pointer en sona götürülmeli bunun için
       pointer sona götürülmeli
         */

        ListIterator<Integer> it1 = l1.listIterator();

        while (it1.hasNext()) {//baştan -> sona pointer sürekli sona doğru ilerler
            it1.next();
        }

        while (it1.hasPrevious()) {//sondan-> başa  pointer sürekli başa doğru ilerler
            System.out.print(it1.previous() + " ");
        }
        System.out.println();
        System.out.println("l1 listi tersten print  hali: " + l1);

        List<String> l2 = new ArrayList<>(Arrays.asList("cagla", "ugur", "muharrem", "cebrail"));
        //l2 elemanlarının sonuncusuna gülücük ekleyip print ediniz
        ListIterator<String> it2 = l2.listIterator();
        System.out.println("listıterator öncesi l2: " + l2);

        while (it2.hasNext()) {
            String s = it2.next();
            if (!it2.hasNext()) {
                it2.set(s + ":)");
            }
        }

        System.out.println(l2);

    }
}
