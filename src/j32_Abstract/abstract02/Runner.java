package j32_Abstract.abstract02;

public class Runner {
    public static void main(String[] args) {
        isci maraba1=new isci();
        maraba1.maasBilgisi();
        maraba1.maasHesapla();
        maraba1.name="ebubekir";
        System.out.println("maraba1.name = " + maraba1.name);
        maraba1.sigorta();//abstract parent class'taki concardate method
        idariPersonel idrprsnl=new idariPersonel();
        idrprsnl.sigorta();
        idrprsnl.maasHesapla();
        idrprsnl.maasBilgisi();
    }
}
