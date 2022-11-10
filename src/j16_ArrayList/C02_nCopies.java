package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_nCopies {
    public static void main(String[] args) {
        ArrayList<String> listUlke=new ArrayList<>(List.of("almanya","amerika","ingiltere","isvec"));

        ArrayList<String>listSehir=new ArrayList<>(List.of("münih","losangelas","londra","stokholm"));



        //addAll();-->
        listUlke.addAll(3,listSehir);
        System.out.println("listSehir = " + listSehir);

        //Task-->1'den 10'a kadar sayılara liste atayıp print eden code create ediniz

ArrayList<Integer>listSayı=new ArrayList<>();


        for (int i = 1; i <= 10; i++) {
            listSayı.add(i);

        }


        System.out.println("listSayı = " + listSayı);



    }
}
