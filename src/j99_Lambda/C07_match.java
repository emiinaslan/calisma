package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_match {
    public static void main(String[] args) {
        List<String> menu = new ArrayList<>(Arrays.asList("küşleme","küşleme","küşleme","soğanli" ,"trilçe" ,"bicibici" ,"buryan" , "welemen","cacıx","kokorec","yaglama", "guvec","arapAşi","tantuni"));
        System.out.println("\n============================");
        hrfSysYedidenAzKontrol(menu);
        System.out.println("\n============================");
        wİleBaslayanKontrol(menu);
        System.out.println("\n============================");
        xİleBiterKontrol(menu);

    }//main sonu
     //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
     //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
     //noneMatch()--> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.

    //Task: List elemanlarının karekter sayılarının 7 ve 7'den az olma durumu kontrol ediniz.->

    public static void hrfSysYedidenAzKontrol(List<String> menu){
      boolean kontrol= menu.stream().allMatch(t -> t.length() <= 7);

        if (kontrol){System.out.println("agam menüdekiler 7 ve daha az karakterden oluşuyor");
        }else System.out.println("agam menüdekiler 7 karakterden daha fazla");
      //  System.out.println("menu.stream().allMatch(t -> t.length() <= 7) ?\"agama menüdekiler 7 ve daha az karakterden oluşşuyor\":\"agam menüdekiler 7 karakteden daha fazla\" = " + menu.stream().allMatch(t -> t.length() <= 7) ? "agama menüdekiler 7 ve daha az karakterden oluşşuyor" : "agam menüdekiler 7 karakteden daha fazla");
    }
    //task: List elemanlarının "W" ile baslaması kontrol ediniz


    public static void wİleBaslayanKontrol(List<String> menu){
        System.out.println(menu.
                stream().
                noneMatch(t -> t.startsWith("w")) //akıştaki hiçbir eleman w ile başlamaz kontrolü yapıldı
                ? "agam w ile baslayan yemek olur mu" : //şart true ise print eder
                "agam wenemen ne menem birşey");//sart false ise print eder
    }
//List elemanlarının "x "ile biten

    public static void xİleBiterKontrol(List<String> menu){
        System.out.println(menu.
                stream().
                anyMatch(t -> t.toLowerCase().endsWith("x")) //akıştaki hiçbir eleman w ile başlamaz kontrolü yapıldı
                ? "agam senden bir cacix o-la-mazz olmaz" : //şart true ise print eder
                "agam senin x buralar da yok");//sart false ise print eder
    }


 }//Class sonu
