package j26_İnheritance.İnheritance02;


public class Runner {

    public static void main(String[] args) {
        Kedi k1 = new Kedi();
        System.out.println("k1.a = " + k1.a);//0->hayvancık class'ından
        System.out.println("k1.c = " + k1.c);//2->kedi class'ından
        System.out.println("k1.d = " + k1.d);//5->kedi class'ından
        System.out.println("k1.m = " + k1.m);//1->mamal class'ında
        k1.mA();
        k1.mC();
        k1.mM();


        Mammal k2 = new Kedi("kevser");
        System.out.println("k2.c = " + k2.c);
        System.out.println("k2.a = " + k2.a);
        System.out.println("k2.n = " + k2.m);
        k2.mA();
        k2.mM();
        k2.mC();
        System.out.println("-*-*-*-*-*-*-*-*-*-*");


        Hayvancık k3 = new Kedi();

        System.out.println("k3.a = " + k3.a);
        System.out.println("k3.m = " + k3.m);
        k3.mA();
        k3.mM();
        System.out.println("--*--*---*--*--*--*--*--*--*--*--*--*--");

       Mammal m1 = new Mammal('$');
        System.out.println("m1 objesinin oluşumu bitti");
        System.out.println("m1.a = " + m1.a);
        System.out.println("m1.c = " + m1.c);
        //m1.d-> parent mamal class child class'dan variable call edemez
        m1.mA();
        m1.mC();
        m1.mM();



    }
}
