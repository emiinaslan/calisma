package j32_Abstract.abstract02.örnek;

public class Runner {
    public static void main(String[] args) {
        Dikdörtgen dd = new Dikdörtgen(24, 7);
        dd.setName("dikdörtgen");
        //dd.cevreHesapla();
        //dd.alanHesapla();
        System.out.println("dd.ciz() = " + dd.ciz());
        System.out.println(dd);

        çember c1 = new çember(39);
        c1.setName("çemberimde gül oya");
        System.out.println(c1);



    }
}
