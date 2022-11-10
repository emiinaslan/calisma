package j18_Constructor;

public class C05_Arac {
    // Fields --> obj' nin üretilirken alacağı değer variables
    // bir class da bir den çok cons tanımlana bilir
    int maxHız;
    String model;

    public C05_Arac() {// sefil p'siz cons
    }

    public C05_Arac(int maxHız) {//1 parametleri cons.
        this(180,"hacı murat");
        this.maxHız = maxHız;
        System.out.println("1 parametli cons. call edildi");
    }

    public C05_Arac(int maxHız, String model) {//2 parametreli cons.
        this.maxHız = maxHız;
        this.model = model;
        System.out.println("ağam bu yazıyı okuduysan 2 parametleri cons call edilmiştir");
    }

   public C05_Arac(String model,int maxHız){//2parametreli cons prametre sırası fartklı

        this.maxHız=maxHız;
        this.model=model;
       System.out.println("2parametreli cons call edilmiştir sırası farklı");
   }



}
