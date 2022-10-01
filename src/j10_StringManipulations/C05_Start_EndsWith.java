package j10_StringManipulations;

public class C05_Start_EndsWith {
    public static void main(String[] args) {
        String sehir="Istanbul";
        sehir.startsWith("I");
        System.out.println(sehir);
        System.out.println(sehir.startsWith("Is"));
        System.out.println(sehir.startsWith("s"));

        System.out.println(sehir.startsWith("a", 3));//3.index ten itibaren String a ile mi  başlar.
        System.out.println(sehir.endsWith("l"));//true
        System.out.println(sehir.endsWith("bul"));//true
        System.out.println(sehir.endsWith("bu"));//false

        String str="bul";
        System.out.println(sehir.endsWith(str));
        int yas=48;
        //System.out.println(sehir.endsWith(yas)); cte

        /*task--< girilen email hesabının @gmail.com içermiyorsa"lütfen gmail hesabı giriniz: "
        @gmail.com ile bitiyorsa "hesabınız onaylandı" aksi durumda "geçerli hesap giriniz." print eden code create ediniz.
        */










    }
}
