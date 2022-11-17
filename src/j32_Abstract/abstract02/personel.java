package j32_Abstract.abstract02;

public abstract class personel {
    String name= "nur hanım";
    public abstract void maasHesapla();//abstract method
    public abstract void maasBilgisi();//abstract method


    public void sigorta(){//concrate method
        System.out.println("özel sigorta kapsamında");
    }
}
