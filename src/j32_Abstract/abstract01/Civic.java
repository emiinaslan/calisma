package j32_Abstract.abstract01;

public class Civic extends Lastik{// Honda parent abstract class extent child concrate class
/*
extends Honda yazılak honda class'a concrete bir civic class tanımlandı java CTE verdi
çözüm: 1-)uniplement metod implement edilmeli
2-) parent class'dann abstract keyword kaldırılmalı
3-) concrete olan cild civic class abstract tanımlanmalı
 */
  //  public abstract void absMethod (); // ya class abs olamlı yada method concrate body olmalı
    // Trick -> child concrate class parent abs class'ın methodlarını mutlaka implement ovirride etmeli
    @Override
    public void motor() {
        System.out.println("1.6 eco motor ");
    }

    @Override
    void koltuk() {
        System.out.println("kumaş koltuk");
    }

    @Override
    void kapı() {
        System.out.println("5 kapı sedan");
    }
    public int vites (){
        return 5;
    }

    @Override
    public void lastikEbat() {
        System.out.println("");
    }
   // Honda obj =new Civic();//honda oğlu civic
   // Civic obj1 =new Civic();// civic oğlu civic




}
