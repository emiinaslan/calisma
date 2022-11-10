package j25_Encapsulation.encapsulation02;

public class Kisi {//pojo Class
    /*
    kisi pojo class için fields-> ad, soyad,password(String),yas
    tüm field'ları kullanıcı görebilmeli ve password hariç uptade edebilmeli
    (password encupsulated uptade edilmemeli.)
    yas veriable negatif değer girmeye karsı encapsulated

    runner class'da obj ile field ları print eden code create ediniz
     */
    //fields..
    String ad;
    String soyad;
    private int yas;
    private String password;

    public Kisi(String ad, String soyad, int yas, String password) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.password = password;
    }

    public int getYas() {
        return yas;
    }

    public String getPassword() {
        return password;
    }

    public void setYas(int yas) {

        this.yas = Math.abs(yas);// parametreye gelen yas değerinin mutlağını aldık

    }
}
