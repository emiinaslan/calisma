package j18_Constructor;

public class C02_Arac {
    String marka;
    String model;
    int km=10;
    double motorHacmi ;
    boolean VitesAuto = false;
    boolean ikinciEl;
    int yıl ;


    @Override
    public String toString() {
        return
                "marka=" + marka +
                " model=" + model +
                " km=" + km +
                " motorHacmi=" + motorHacmi +
                " VitesAuto=" + VitesAuto +
                " ikinciEl=" + ikinciEl +
                " yıl=" + yıl ;
    }

    public static void main(String[] args) {

        C02_Arac arac1 =new C02_Arac();
        arac1.ikinciEl=true;
        arac1.marka = "volvo";
        arac1.km=50000;
        arac1.model = "xc60";
        arac1.motorHacmi= 2.4;
        //                       volvo           xc60           50000          0          * true *               * 2.4 *
        System.out.println(arac1.marka+" "+arac1.model+" "+arac1.km+" "+arac1.yıl+" "+arac1.ikinciEl+" "+arac1.motorHacmi);

        C02_Arac arac2 =new C02_Arac();
        arac2.ikinciEl=true;
        arac2.marka = "mercedes";
        arac2.km=50000;
        arac2.model = "AMG";
        arac2.motorHacmi= 3.0;
        arac2.VitesAuto=true;
        arac2.yıl=2000;


        //                       volvo           xc60           50000          0          * true *               * 2.4 *
        System.out.println(arac2.marka+" "+arac2.model+" "+arac2.km+" "+arac2.ikinciEl+" "+arac2.motorHacmi+" "+ arac2.VitesAuto+" "+arac2.yıl);
        System.out.println("arac2 = " + arac2);


    }//main sonu

}
