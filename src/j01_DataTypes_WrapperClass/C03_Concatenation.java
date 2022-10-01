package j01_DataTypes_WrapperClass;

public class C03_Concatenation {
    public static void main(String[] args) {
        String ad = "mehmet emin";
        String soyad = "aslan";
        int a=7;
        int b=11;
    // birden çok string  variable ile farklı variabıleler + ile işleme alınırsa java birleş
        // trime yaparak yeni bir strig oluşturur
        System.out.println(ad+soyad+a+b);//mehmet eminaslan711

        System.out.println(a+ad+soyad+b);//7mehmet eminaslan11

        System.out.println(a+ad+soyad+b);//7mehmet eminaslan11

        System.out.println(" "+a+b);//711

        System.out.println(ad+soyad+(a+b));//mehmet eminaslan18

        System.out.println((a+b)+ad+soyad);//18mehmet eminaslan

        System.out.println(ad+(a-b)+(a-b));//mehmet emin-4-4

        System.out.println(ad+((a-b)+(a-b)));//mehmet emin-8

        char ch='1';//
        System.out.println(ad+ch);

        System.out.println(a+ch+ad);

        System.out.println(ad+(ch+b));

        System.out.println(a+ad+ch);











    }
}
