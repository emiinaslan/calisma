package yiyecekİcecekOtamati;

public class ürün {
    /*
    Urun Class ı Nitelikler:
•  1kraker=2.5;
•  2cips=2.2;
•  3cocaCola=2.2;
•  4fanta=2.0;
•  5su=1.0;
•  6cay=1.5;
•  7filtreKahve=1.99;
•  8productNum;
•  9price;
•

    */
    private double kraker=2.5;
    private double cips=2.2;
    private double cocaCola=2.2;
    private double fanta=2.0;
    private double su=1.0;

    public double getKraker() {
        return kraker;
    }

    @Override
    public String toString() {
        return "options{" +
                "kraker=" + kraker +
                ", cips=" + cips +
                ", cocaCola=" + cocaCola +
                ", fanta=" + fanta +
                ", su=" + su +
                ", cay=" + cay +
                ", filtreKahve=" + filtreKahve +
                ", productNum=" + productNum +
                ", price=" + price +
                '}';

    }

    public void setKraker(double kraker) {
        this.kraker = kraker;
    }

    public double getCips() {
        return cips;
    }

    public void setCips(double cips) {
        this.cips = cips;
    }

    public double getCocaCola() {
        return cocaCola;
    }

    public void setCocaCola(double cocaCola) {
        this.cocaCola = cocaCola;
    }

    public double getFanta() {
        return fanta;
    }

    public void setFanta(double fanta) {
        this.fanta = fanta;
    }

    public double getSu() {
        return su;
    }

    public void setSu(double su) {
        this.su = su;
    }

    public double getCay() {
        return cay;
    }

    public void setCay(double cay) {
        this.cay = cay;
    }

    public double getFiltreKahve() {
        return filtreKahve;
    }

    public void setFiltreKahve(double filtreKahve) {
        this.filtreKahve = filtreKahve;
    }

    public int getProductNum() {
        return productNum;
    }

    public void setProductNum(int productNum) {
        this.productNum = productNum;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double cay=1.5;
    private double filtreKahve=1.99;
    private int    productNum;
    private double price;


}
