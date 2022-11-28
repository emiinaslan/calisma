package j99_Lambda;

import java.util.*;
import java.util.stream.Collectors;

public class C10_object {
    public static void main(String[] args) {
    /*
TASK :
fields --> Universite (String)
           bolum (String)
           ogrcSayisi (int)
           notOrt (int)
           olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
 */
        University u01=new University("bogaziçi","matematik",571,93);
        University u02=new University("Istanbul","matematik",622,77);
        University u03=new University("Marmara","hukuk",1453,71);
        University u04=new University("Itu","uçak muh.",333,63);
        University u05=new University("Yıldız Teknik","gemi",216,55);

        List<University>unv=new ArrayList<>(Arrays.asList(u01, u02, u03, u04, u05));
        System.out.println("notOrtytmsDrtByk(unv) = " + notOrtytmsDrtByk(unv)); // false
        System.out.println("\n============================");
        System.out.println("Task02 = " + ogrnciSysı110danAzmi(unv));//True
        System.out.println("\n============================");
        System.out.println("Task03 = " + enAz1MatVarmı(unv));//True
        System.out.println("\n============================");
        System.out.println("Task04 = " + sırala(unv));
        System.out.println("\n============================");
        System.out.println("Task05 = " + sırala(unv));
        System.out.println("\n============================");
        System.out.println("Task06 = " + ogrSayısıazOlan2uni(unv));
        System.out.println("\n============================");
        System.out.println("Task07 = " + notOrtlm63BuykogrSayısıToplam(unv));
        System.out.println("\n============================");
        System.out.println("Task08 = " + ogr333denBuyuk(unv));


    }//main sonu
    //Task : notOrt'larının 74'den buyuk olsa kontrol eden pr create ediniz.

public static  boolean notOrtytmsDrtByk( List<University>unv){

        return unv.
                stream().
                allMatch(t-> t.getNotOrt()>74);
}

//Task02==>ogrc sayilarinin   110 den az olmadigini  kontrol eden pr create ediniz.
public static boolean ogrnciSysı110danAzmi(List<University>unv){
        return unv.
                stream().
                allMatch(t->t.getOgrcSayisi()>=110);
}
//task 03-->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden pr create ediniz.
    public static boolean enAz1MatVarmı(List<University>unv){
        return unv.
                stream().
                anyMatch(t->t.getBolum().toLowerCase().contains("matematik"));
    }

    //task 04-->universite'leri ogr sayilarina gore b->k siralayiniz.
public static List<University> sırala(List<University>unv){

       return unv.
               stream().sorted(Comparator.comparing(University::getOgrcSayisi).reversed()).collect(Collectors.toList());//akıştaki elemanlar Liste atandı
    //collect(Collectors.coll)=> Collectı class'dan call edilen.meth ile akış elemanları atanır
}
//task 05-->universite'leri notOrt gore  b->k siralayip ilk 3 'unu print ediniz.
public static List<University> NotOrtlmaTrsırala(List<University>unv) {

    return unv.
            stream().sorted(Comparator.comparing(University::getNotOrt).reversed()).limit(3).collect(Collectors.toList());
}
//task 06--> ogrc sayisi en az olan 2. universite'yi  print ediniz.
public static List<University> ogrSayısıazOlan2uni(List<University>unv) {

    return unv.
            stream().
            sorted(Comparator.comparing(University::getOgrcSayisi)).
            limit(2).
            skip(1).collect(Collectors.toList());

}
//task 07--> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print ediniz.
    public static int notOrtlm63BuykogrSayısıToplam(List<University>unv){
       return unv.
                stream().
                filter(t->t.getNotOrt()>63).
               mapToInt(t->t.getOgrcSayisi()).//akıştaki elemanların data type'ını parametredeki değere göre update eder
               sum();


    }
    //task 08--> Ogrenci sayisi 333'dan buyuk olan universite'lerin notOrt'larinin ortalamasini bulunuz.
    public static OptionalDouble ogr333denBuyuk(List<University>unv){
        return unv.
                stream().
                filter(t->t.getOgrcSayisi()>333).
                mapToDouble(t->t.getNotOrt()).average();//akıştaki elemanların data type'ını parametredeki değere göre update eder



    }

}//class sonu
