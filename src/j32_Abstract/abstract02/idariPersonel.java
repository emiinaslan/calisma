package j32_Abstract.abstract02;

public class idariPersonel extends personel{
    @Override
    public void maasHesapla() {
        System.out.println("saati 120$");
    }

    @Override
    public void maasBilgisi() {//mecbur Implement edildi
        System.out.println("code yazan idari personele 1 ay ikramşye");
    }

    @Override
    public void sigorta() {//personel parent classtan concardate
        System.out.println( " full sigorta");
    }
}
