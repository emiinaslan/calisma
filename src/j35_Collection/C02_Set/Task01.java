package j35_Collection.C02_Set;

import java.util.*;

public class Task01 {
    public static void main(String[] args) {
        /*
       Değer ataması yapılan Arry' i ArryListe çeviren  method create ediniz main içersinde methodun return ettiği has;SEt,
       LinkenHasSet' e atayınız

         */
        String arr[]={"Muharrem","Umit","Sinan","Nihan"};
        arryListeCevir(arr);
        HashSet<String>hs=new HashSet<>(arryListeCevir(arr));
       LinkedHashSet<String>lnkdHshSt=new LinkedHashSet<>(arryListeCevir(arr));

        TreeSet<String>trSt=new TreeSet<>(arryListeCevir(arr));

        System.out.println("hurraSet = " + hs);
        System.out.println("erken gelen girerSet:"+ lnkdHshSt);
        System.out.println("alfabetik sıra set:" + trSt);
    }//main sonu

    public static ArrayList<String> arryListeCevir(String[] arr) {

        ArrayList<String>arryLst=new ArrayList<>(List.of(arr));

        return arryLst;
    }
}
