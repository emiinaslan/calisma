package j35_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        /*
        Task->
        Node değerleri "yakup","javaCAN","javaTAR","Tekinay" olan bir linkedList create ediniz
        Girilen bir String değeri LinkedList varlığını kontrol edip varsa silip "agam eleman halledildi"
        yoksa "agam radığınız kşiye ulaşılamıyor" print eden code create ediniz

         */

        LinkedList<String>ll1=new LinkedList<>(Arrays.asList("yakup","javaCAN","javaTAR","Tekinay"));
        Scanner sc =new Scanner(System.in);
        System.out.println("aga kime baktın");
        String aganınAdamı=sc.next();
        System.out.println("ll1 = " + ll1);
        if (ll1.remove(aganınAdamı)){
            System.out.println("agam eleman halledildi");
            System.out.println("aganın adamı hallolduktan sonra"+ll1);
        }else System.out.println("aga aradığın kişiye ulaşılamadı");
    }
}
