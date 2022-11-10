package j18_Constructor;

public class C07_Ogrtmn {
    String isim;
    int tecrbe ;
    int kıdem= 5;
    public C07_Ogrtmn(String isim, int tecrbe) {
        this.isim = isim;
        this.tecrbe = tecrbe;



    }
    public void kıdemHesapla(int kıdem){
        System.out.println("agam kıdemin :"+(kıdem*2));
        System.out.println( "agam kıdemin :"+ (this.kıdem*2));
    }

}
