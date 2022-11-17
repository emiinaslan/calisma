package j33_InterFace.task01;

public class Dikdörtgen implements Sekil {

    @Override
    public int cevre(int... boyut) {
        if (boyut.length == 1) {//vararga agirilen parametre 1 tane ise kare cevre hesapla
            return boyut[0] * 4;
        } else return (boyut[0] + boyut[1]) * 2;////vararga airilen parametre 1 tane değil ise dikdörgen  cevre hesapla
    }

    @Override
    public int alan(int... boyut) {
        if (boyut.length == 1) {//vararga girilen parametre 1 tane ise kare alan hesapla
            return boyut[0] * boyut[0];
        } else return boyut[0] * boyut[1];//vararga agirilen parametre 1 tane değil ise dikdörgen  alan hesapla
    }
}
