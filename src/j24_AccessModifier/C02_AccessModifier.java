package j24_AccessModifier;

public class C02_AccessModifier {
    public static void main(String[] args) {
        //C01_AccessModifier obj1 =new C01_AccessModifier();
        C01_AccessModifier ob2= new C01_AccessModifier(23,45);
        C02_AccessModifier semra =new C02_AccessModifier();// defaul p'siz cons

        System.out.println("ob2.defaultYas = " + ob2.defaultYas);
        ob2.protectedMethod();
        System.out.println("ob2.puplicYas = " + ob2.puplicYas);
       // ob2.privateMethod();//private methods call edilemez
        System.out.println("ob2.protectedYAs = " + ob2.protectedYAs);


    }
}
