package j32_Abstract.abstract01;

public class Runner {
    public static void main(String[] args) {
        Civic cvc = new Civic();
        cvc.sunroff();
        cvc.vites();
        cvc.lastikEbat();
        cvc.motor();
        cvc.koltuk();
        cvc.kapı();

       //String ANSI_RESET = "\u001B[0m";
        String ANSI_SIYAH = "\u001B[30m";
        //System.out.println(ANSI_SIYAH+"selam");
        String ANSI_KIRMIZI = "\u001B[31m";
        System.out.println(ANSI_KIRMIZI+"ESMA SELAM");
        Accord accord = new Accord();
        accord.kapı();
        accord.motor();
        accord.koltuk();
        accord.sunroff();


    }
}
