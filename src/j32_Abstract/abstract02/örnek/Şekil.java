package j32_Abstract.abstract02.örnek;

public abstract class Şekil {
    private String name;

    public Şekil(String name) {
        setName(name);
    }

    public Şekil() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
public abstract double alanHesapla();

    public abstract double cevreHesapla();

   // public void ciz(){
   //     System.out.println(this.name+"cizildi");
   // }
    public String ciz(){
        return this.name+" cizildi";
    }

    @Override
    public String toString() {
        return
                "sekil ismi='" + this.name + '\'' +"\nsekil alanı : "
                        +this.alanHesapla()+"\nsekil cevre : "+this.cevreHesapla()+
        "\nsekil "+this.ciz();
    }
}
