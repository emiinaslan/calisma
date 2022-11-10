package j18_Constructor;

public class C04_Teacher {
    String ad ;
    String soyad;

    public C04_Teacher() {//p'lini ezdiği default cons yerine p siz cons create edildi
    }

    public C04_Teacher(String ad, String soyad, int tecrübe, String branş, double maaş, int id, boolean emekli) {
        this.ad = ad;
        this.soyad = soyad;
        this.tecrübe = tecrübe;
        this.branş = branş;
        this.maaş = maaş;
        this.id = id;
        this.emekli = emekli;
    }

    @Override
    public String toString() {
        return "C04_Teacher{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", tecrübe=" + tecrübe +
                ", branş='" + branş + '\'' +
                ", maaş=" + maaş +
                ", id=" + id +
                ", emekli=" + emekli +
                '}';
    }

    int tecrübe;
    String branş;
    double maaş ;
    int id ;
    boolean emekli;
    public void  dersSaati(){
        System.out.println("agam haftada 20 saat");
    }
}
