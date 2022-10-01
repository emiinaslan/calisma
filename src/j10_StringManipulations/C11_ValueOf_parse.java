package j10_StringManipulations;

public class C11_ValueOf_parse {
    public static void main(String[] args) {
        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
// Stringlerle matematiksel islemler yapabilmemizi saglar.

//valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
//olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.
        String bagis1 = "1500";
        String bagis2 = "2500";
        int bagısDegeri = Integer.valueOf(bagis1);
        int bagısDegeri1 = Integer.valueOf(bagis2);
        System.out.println("toplam :" + (bagısDegeri+bagısDegeri1));





























    }

}
