package j35_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    /*
    LinkedList-)
    1. LinkedList'te node "data" ve "adre" olmak üzere 2 kısımdan oluşur ve eleman yerine node olarak tanuımlanır
    2. LinkedList'e ilk node data barındırmayan sadece adres bulunduran head node tanımlanır
    3. LinkedList'e son node adres kısmı null olan sadece data bulunduran tail  node tanımlanır
    4. ArrayList searching  LinkedList node ekleme ve silmede daha avantajlıdır. LinkedList eleman bulmada index yapısı olmadıgı için
    5. LinkedList -> tren vagon ilişkisi bağlantısı gibi düşünülebilir
    6. Collection objesi tanımlanırken cons. Class(LinkedList,ArrayList...) olmalı interface(List,Queue...) olmasına dikkat
    edilmeli ancak DataType olarak interface tanımlanabilir
    7. LinkedLİst class iki tane parent interface'den(List,queue) implement etmiştir.

     */

    public static void main(String[] args) {
        LinkedList<String >ll1=new LinkedList<>(Arrays.asList("Ebubekir","Gülsüm","Adem","İlker","Merve"));
        System.out.println("ll1 = " + ll1);

        ll1.add("ugur");
        System.out.println("ll1 = " + ll1);//[Ebubekir, Gülsüm, Adem, İlker, Merve, ugur]

        ll1.add(2,"abdulaziz");
        System.out.println("ll1 = " + ll1);//[Ebubekir, Gülsüm, abdulaziz, Adem, İlker, Merve, ugur]
        ll1.addFirst("javacan");
        System.out.println("ll1 = " + ll1);//[javacan, Ebubekir, Gülsüm, abdulaziz, Adem, İlker, Merve, ugur]
        ll1.addLast("javatar");
        System.out.println("ll1 = " + ll1);//[javacan, Ebubekir, Gülsüm, abdulaziz, Adem, İlker, Merve, ugur, javatar]
        List<String>ll2=new LinkedList<>(Arrays.asList("fatih","erol","nur"));//DataType interface List olan LinkedList
        ll1.addAll(ll2);
        //ll1.addAll("agam")//CTE-> parametre Col olmazsa
        System.out.println("ll1 = " + ll1);
        ll1.addAll(3,ll2);
        System.out.println("ll1 = " + ll1);//[javacan, Ebubekir, Gülsüm, fatih, erol, nur, abdulaziz, Adem, İlker, Merve, ugur, javatar, fatih, erol, nur]



    }


}
