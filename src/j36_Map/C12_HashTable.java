package j36_Map;

import java.util.Hashtable;

public class C12_HashTable {
    public static void main(String[] args) {
        /*
        HashTable->
        HashMap'te kullanılan tüm methodlar HashTable ile call edilir
        1-Hashmap ve TreNAp thread-safe ve synchronized olmadığı için Mapler arasında thread-safe ve  synchronized

        2-HashTable HashMap' egöre daha yavaştır
        3-HashTable key ve value'lerda null değere izin vermez
        4-HashTable eleman ataması yapılırken HashMap random (rastgele) yapar

         */

        Hashtable<String,String>ht=new Hashtable<>();
        ht.put("kebap","adana");
        ht.put("döner","sivas");
        ht.put("köfte","tekirdağ");
        ht.put("çorba","beyran");
        ht.put("söğüş","");
        System.out.println("ht = " + ht);
        ht.put("döner","dönerse senindir :) ");//döner key update edilir key'de dublicate değil üzerine value ataması yapılır
        System.out.println("ht = " + ht);
        //ht.put(null,"trilçe");//NullPointerException
        //ht.put("kahve",null);//NullPointerException
        System.out.println("aga selametle");

        Hashtable<String,String>ht1=new Hashtable<>();
        ht1.put("salata","patlıcan közleme");
        ht1.put("ara sıcak","içli köfte");
        System.out.println("ht1 = " + ht1);
        ht.putAll(ht1);
        System.out.println("ht = " + ht);
        System.out.println("ht1 = " + ht1);

    }
}
