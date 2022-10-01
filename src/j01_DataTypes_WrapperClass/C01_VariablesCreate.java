package j01_DataTypes_WrapperClass;

public class C01_VariablesCreate {

    public static void main(String[] args) {

        // 1.yol : best practice(recomended) tavsiye edilen
        int yas=48;
        int maas=15896;
        System.out.println("yas");// yas
        System.out.println(yas);//48
        System.out.println(maas);//15896
        System.out.println("nur hanım başlangıç maaşı : "+maas);//nur hanım başlangıç maaşı : 15896

        //2.yol:
        int boy; // değeri atanmadan boy isminde bir int tanımlandı.
        //System.out.println(boy);//değeri atanmamış değişkeni hiçbir aksiyonda kullanılmaz.
        boy =175;
        System.out.println("boyunuz : " + boy);

        //3.yol:

        int yevmiye, age, kilo;// birden çok aynı tipte değişken tanımlandı.
        age=33;
        yevmiye=1000;
        kilo=99;//tanımlanan değişkenlere değer ataması yapıldı.
        int gunluk=1500, yil=2022, agırlık=99;
        //trick: bir variable sadece bir kez tanımlanabilir, birden çok değer atanabilir.

        System.out.println(gunluk);//1500

        gunluk=1800;
        System.out.println("gunluk son degeri : " + gunluk);//gunluk son degeri : 1800




    }
}