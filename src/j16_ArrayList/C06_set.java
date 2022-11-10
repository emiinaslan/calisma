package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_set {
    public static void main(String[] args) {
        //set();--> listin istenen indexe istenen elemanı update eder
        ArrayList<String> listSehir=new ArrayList<>(List.of("münih","losangelas","londra","stokholm"));
        System.out.println("listSehir.set(3,\"ankara\") = " + listSehir.set(3, "ankara"));
        System.out.println("listSehir = " + listSehir);



        //System.out.println("listSehir.set(11,\"patagonya\") = " + listSehir.set(11, "patagonya"));//olmayan index RET hatası verir
    }
}
