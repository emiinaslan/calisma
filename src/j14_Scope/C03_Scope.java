package j14_Scope;

public class C03_Scope {
    public static void main(String[] args) {

        C01_İnstanceVeriable kus=new C01_İnstanceVeriable();//istediğim classtan kuş obje ettim

        kus.name = "huma kuşu";
        System.out.println(kus.name);
        kus.developerMı = false;
        C01_İnstanceVeriable.staticMethot();
        kus.non_staticMethod();//obje ile non-static method getirdik



    }//main
}
