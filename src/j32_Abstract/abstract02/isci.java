package j32_Abstract.abstract02;

public class isci extends personel{//abstract class exdent ->concardate child isçi class'a

    @Override
    public void maasHesapla() {//personel parent class'tan overide abstract method
        System.out.println("yevmiye 400");
    }

    @Override
    public void maasBilgisi() {
        System.out.println("8 saat mesai");
    }
}
