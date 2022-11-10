package j20_PassByValue;

public class C04_PassByValue {
    static double etiketFiyat;
    static double indirimOranı;

    public static void main(String[] args) {
        /*
        egre bir methodta yapılan değişiklik kalıcı olsun istenirse
        1.yol-> değişliklik yapılan variable'lar static olarak tanımlanır
         */
        etiketFiyat = 100;
        System.out.println("indirim öncesi = " + etiketFiyat);
        indirimOranı = 0.89;

        indir();
        indirimOranı = 0.78;
        indir();
        indirimOranı = 0.95;
        indir();
        System.out.println("indirim sonrası = " + etiketFiyat);
    }//main sonu

    public static void indir() {
        etiketFiyat *= indirimOranı;
        System.out.println("etiketFiyat = " + etiketFiyat);
    }
}
