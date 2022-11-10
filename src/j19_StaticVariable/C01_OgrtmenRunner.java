package j19_StaticVariable;

import j18_Constructor.C07_Ogrtmn;

public class C01_OgrtmenRunner {
    public static void main(String[] args) {

C01_Ogrtmn hoca= new C01_Ogrtmn("cüneyt",11);
        System.out.println("hoca.tecrube = " + hoca.tecrube);
        System.out.println("hoca.isim = " + hoca.isim);

        // hoca.okul="kabadaş";//static veriable obje ile code edilmez
        System.out.println("hoca.okul = " + hoca.okul);
        C01_Ogrtmn.okul= " KABATAŞ ERKEK LİSESİ";


        C01_Ogrtmn hoca1= new C01_Ogrtmn("bekir",7);
        System.out.println("hoca1.tecrube = " + hoca1.tecrube);
        System.out.println("hoca1.isim = " + hoca1.isim);

       //  hoca1.okul = "kabataş";
        System.out.println("hoca1.okul = " + hoca1.okul);


        C01_Ogrtmn hoca2= new C01_Ogrtmn("nazım",13);
        System.out.println("hoca2.tecrube = " + hoca2.tecrube);
        System.out.println("hoca2.isim = " + hoca2.isim);

       //hoca2.okul="gabadaş";
        System.out.println("hoca2.okul = " + hoca2.okul);

hoca.evlilikYıldonumu();//obje ile non-static medhod call ettik
            C01_Ogrtmn.maasHesapla();//class name ile static method call ettik
            hoca.maasHesapla();//obj ile static method call edildi.



    }// main sonu
}
