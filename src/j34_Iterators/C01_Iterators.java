package j34_Iterators;

import java.util.*;

public class C01_Iterators {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>(Arrays.asList("nur", "gamze", "erol", "bekir"));
        System.out.println("l1 ilk hali " + l1);

        //l1 eleman

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");

        }
        System.out.println();
        System.out.println("         ******        ");

        //l1 elemanlarını for-each loop ile print ediniz
        for (String w : l1) {
            System.out.print(w + " ");

        }
        System.out.println();
        System.out.println("  *****    ");
        // l1 herbir elamanın sonuna :) for loop ile update edip print ediniz

        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.set(i, l1.get(i) + ":-)"));
        }
        System.out.print(l1);
        System.out.println();
        System.out.println("  *******   ");
        //l1'in herbir elemanını :-( for-each loop ile update edip print ediniz
        for (String w : l1) {
            w += ":-(";
        }
        System.out.println(l1);
        /*
        index destekolemeyen yapılarada tekrarlşayan aksiyon için for-each loop update yapamaya bilir yukardaki taks'te
        olduğu gibi bu durum da java iterator interface'den tanımlanacak variable ile tekrarlayan aksiyonlar index
        olmadan yapılır
         */
        System.out.println();
        System.out.println("***** Iterators *******");

        Iterator<String> it1 = l1.iterator();//Iterator intfaceden it1 variable tanımlandı. Atama olarak l1elemanları atandı


        while (it1.hasNext()) {//it1 elemanları için pointer oldupğu yerde eleman varsa true yoksa false verir ve pointer bir sonraki eleman önüne konulur

            //it1.next();//next(); -> list'in pointer elemanını return eder


            System.out.print(it1.next() + " ");


        }
        List<String> l2 = new ArrayList<>(Arrays.asList("baran", "gülsüm", "akif", "nazım"));

        //l2 elemanlarını ıterator ile silip print ediniz
        System.out.println("itaratör öncesi" + l2);

        Iterator<String> it2 = l2.iterator();
        while (it2.hasNext()) {//tekrardaki pointer önünde eleman varlığını kontrol eder
            it2.next();//tekrardaki pointer önündeki elemanı verir
            it2.remove();//next() ilen gelen elemanı siler

        }

        System.out.println(" itaratör remove sonrası " + l2);
        //l3 elemanlaerını ıterator ile set edip print eden code create ediniz
        List<String> l3 = new ArrayList<>(Arrays.asList("baran", "gülsüm", "akif", "nazım"));

        ListIterator<String> lstİt3 = l3.listIterator();//tekrar iterator yapısı tanımlandı

        while (lstİt3.hasNext()) {

            lstİt3.set(lstİt3.next() + ":-)");
        }

        System.out.println(l3);
//l4 elemanlarının ilk harfi büyük kalan 3 harfi *** karakteri ve 14 listi ekleyip print edeniz

        List<String> l4 = new ArrayList<>(Arrays.asList("baran", "gülsüm", "akif", "nazım"));
        ListIterator<String> ebikGabik = l3.listIterator();//iteratör yapısı tanımlandı
        while (ebikGabik.hasNext()) {

            ebikGabik.set(ebikGabik.next().toUpperCase().charAt(0)+"***");
            ebikGabik.add(l4.toString());
        }
        System.out.println(l3);
    }
}
