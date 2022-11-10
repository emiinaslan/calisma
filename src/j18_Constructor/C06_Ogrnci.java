package j18_Constructor;

public class C06_Ogrnci {//ogrenci objesi için kalıp hane

    // Fields
    String isim= "merve hanım" ;
    int yas ;
    String name ;
    int age ;

    public C06_Ogrnci(String isim, int yas) {//2 parametreli
        //this.isim = isim;
        //this.yas = yas;
        name=isim;
        age=yas;
        System.out.println("cons' taki isim : "+ isim);
        System.out.println("cons' taki name1 : "+ this.isim);
        System.out.println("cons' taki name : "+ name);
    }
}
