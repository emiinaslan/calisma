package j32_Abstract.abstract02.örnek;

public class Dikdörtgen extends Şekil {
    private double uzunKenar;
    private double kısaKenar;

    public Dikdörtgen(double uzunKenar, double kısaKenar) {
        this.uzunKenar = uzunKenar;
        this.kısaKenar = kısaKenar;
    }

    @Override
    public double alanHesapla() {
        return this.uzunKenar*this.kısaKenar;
    }

    @Override
    public double cevreHesapla() {
        return (this.uzunKenar+this.kısaKenar)*2;
    }
}
