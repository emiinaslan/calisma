package j32_Abstract.abstract02.örnek;

public class çember extends Şekil {
    private double yarıÇap;
    private final double pi=3.14;

    public çember(double yarıÇap) {
        this.yarıÇap = yarıÇap;
    }

    public double getYarıÇap() {
        return yarıÇap;
    }

    public void setYarıÇap(double yarıÇap) {
        this.yarıÇap = yarıÇap;
    }

    public double getPi() {
        return pi;
    }

    @Override
    public double alanHesapla() {
        return pi*this.yarıÇap;
    }

    @Override
    public double cevreHesapla() {
        return 2*pi*this.yarıÇap;
    }
}
