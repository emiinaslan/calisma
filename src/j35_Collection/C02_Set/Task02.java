package j35_Collection.C02_Set;

import java.util.Date;
import java.util.HashSet;
import java.util.TreeSet;

public class Task02 {
    public static void main(String[] args) {
        //hashSet ve treeSet tanımlayıp run sürelerini karsılastırınız
        //Trick--> run süresi için Sytem.currentTimeMillis() method call ediniz

        long hsBasla=System.currentTimeMillis();
        HashSet<String>hshSt=new HashSet<>();
        hshSt.add("Mehmet");
        hshSt.add("Emin");
        hshSt.add("Aslan");
        hshSt.add("Naber");
        long hsBitir=System.currentTimeMillis();
        System.out.println("HashSet Run Süresi: "+ (hsBitir-hsBasla));
        System.out.println("******************");
        long TrehsBasla=System.currentTimeMillis();
        TreeSet<String>trSt=new TreeSet<>();
        trSt.add("Selam");
        trSt.add("Java");
        trSt.add("Ben");
        trSt.add("JavaMen");
        System.out.println("trSt = " + trSt);
        long TrehsBitir=System.currentTimeMillis();

        System.out.println("TreeSet Run Süresi: "+ (TrehsBitir-TrehsBasla));


        //İnterview question : girilen String datanın karakterleri alfabetik print edeniz


    }
}
