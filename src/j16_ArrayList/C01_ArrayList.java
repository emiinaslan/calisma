package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayList {
    public static void main(String[] args) {
        int sayı =33;// tek bir data saklaya bilen veriable
        int sayı1[]=new int[5];// 5 int değer saklaya bilir
        int sayı2[][]=new int[5][6];// 5*6 int değer saklaya bilir
        ArrayList<Integer>sayiList = new ArrayList<>();//istediğin kadar int değer saklaya bilen yapı



        ArrayList<Integer>listSayi =new ArrayList<>();//boş integer type list oluşturuldu
        //1--> yol
        listSayi.add(10);
        System.out.println(listSayi);
        listSayi.add(39);
        listSayi.add(72);
        listSayi.add(61);
        listSayi.add(41);
        listSayi.add(41);
        System.out.println("listSayi = " + listSayi);
        //2.yol --> Arrays.
        ArrayList<String>lisİsim=new ArrayList<>(Arrays.asList("muharrem bey","nur","enise","fatih"));//
        System.out.println("lisİsim = " + lisİsim);
        //3.yol-->list.of() methodu
        ArrayList<String>listUlke=new ArrayList<>(List.of("almanya","amerika","ingiltere","isvec"));
        listSayi.add(2,14);// index 2 ye 14 değerini ekler 2. indexteki eski eleman bir index ileri yazılır

        System.out.println("listSayi = " + listSayi);
        listSayi.set(2,100);
        System.out.println("listSayi = " + listSayi);



    }//main sonu
}
