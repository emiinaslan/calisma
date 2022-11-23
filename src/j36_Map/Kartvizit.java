package j36_Map;

public class Kartvizit {
   String isim;
   String email;
   String adre;
    int telno;
    int id=100;

    public Kartvizit(String isim, String email, String adre, Integer telno) {
        this.isim = isim;
        this.email = email;
        this.adre = adre;
        this.telno = telno;
        this.id++;
    }

    @Override
    public String toString() {
        return "Kartvizit{" +
                "isim='" + isim + '\'' +
                ", email='" + email + '\'' +
                ", adre='" + adre + '\'' +
                ", telno='" + telno + '\'' +
                '}';
    }
}
