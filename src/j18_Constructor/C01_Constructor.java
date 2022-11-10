package j18_Constructor;

public class C01_Constructor {
    String str;//inst variable -> obje veriable
    String selam = "güzel insan";

    public static void main(String[] args) {
        /*
        1- constructor ismi Class bame ile aynı olmalıdır büyk harf ile başlamalı
        2- constructor create edildiğinde name den sonra () {} mutlaka kullanılmalı
        3-eger p'li cons. create edildiğinde java default cons ezer (siler)

         */
        // clas name        obje name        new keyword   default cons.
        C01_Constructor obj = new C01_Constructor();
        C01_Constructor obj1 = new C01_Constructor();
        C01_Constructor obj2 = new C01_Constructor();
        C01_Constructor obj3 = new C01_Constructor();
        obj.str = "java can";//str ins veriable obj ile call edilerek obje değeri atandı
        obj1.str = "javatar";
        System.out.println(obj2.selam);//

        System.out.println(obj.str);
        System.out.println(obj1.str);
        System.out.println(obj3.str);
        obj2.aga();


    }//main sonu
    public  void aga(){
        System.out.println("agama selam");
    }
}
