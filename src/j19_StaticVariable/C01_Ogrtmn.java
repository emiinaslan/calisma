package j19_StaticVariable;

public class C01_Ogrtmn {
    //fiels
    String isim ;
    int tecrube;
   static String okul ;

    public C01_Ogrtmn(String isim, int tecrube) {
        this.isim = isim;
        this.tecrube = tecrube;
    }
    public static  void maasHesapla(){//static method
        System.out.println("agam helal olsun maaşını yeee :) ");


    }

    public void evlilikYıldonumu(){ //non-static method
        System.out.println( " agam 1 yastıkta 40 yıl ");

    }


}
