package j18_Constructor;

public class C07_OgrtmnRunner {
    public static void main(String[] args) {

        C07_Ogrtmn hcm = new C07_Ogrtmn("sevdenur öğretrmten",11);
        System.out.println("hcm.isim = " + hcm.isim);
        System.out.println("hcm.kıdem = " + hcm.kıdem);
        hcm.kıdemHesapla(13);//


    }
}
