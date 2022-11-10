package j20_PassByValue;

public class C05_PassByValue {
    public static void main(String[] args) {
         /*
        egre bir methodta yapılan değişiklik kalıcı olsun istenirse
        2.yol-> değişliklik yapılan variable'lara atama tanımlanır
         */
        double etiketFiyat = 100;

        double indirimOranı = 0.1;

        System.out.println("indirim öncesi: " + etiketFiyat);

        etiketFiyat = indirim(etiketFiyat, indirimOranı);

        System.out.println("indirim sonrası: " + etiketFiyat);

    }//main sonu

    public static double indirim(double fiyat, double oran) {
        fiyat *= (1 - oran);
        System.out.println("indirimli fiyat: " + fiyat);
        return fiyat;
    }
}
