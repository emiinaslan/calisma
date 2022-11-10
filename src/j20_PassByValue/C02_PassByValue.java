package j20_PassByValue;

public class C02_PassByValue {
    public static void main(String[] args) {

        //-->verilen fiat için %11 %22 ve %33 indirim cereate ediniz

        double fiyat = 100;
        System.out.println("method call öncesi fiyat = " + fiyat);

        System.out.println("indirimyuzde33(fiyat) = " + indirimyuzde33(fiyat));
        //System.out.println("indirimyuzde11(fiyat) = " + indirimyuzde11(fiyat));

        System.out.println("indirimyuzde22(fiyat) = " + indirimyuzde22(fiyat));

        System.out.println("indirimyuzde33(fiyat) = " + indirimyuzde33(fiyat));

        System.out.println("method call sonarsı fiyatı = " + fiyat);


    }// main sonu

    private static double indirimyuzde33(double fiyat) {
        return fiyat *= 0.67;
    }

    private static double indirimyuzde22(double fiyat) {
        return fiyat * 0.78;
    }

    private static void indirimyuzde11(double fiyat) {
        fiyat *= 0.89;
        System.out.println("fiyat = " + fiyat);
        fiyat+=200;
        System.out.println("fiyat = " + fiyat);
    }
}
