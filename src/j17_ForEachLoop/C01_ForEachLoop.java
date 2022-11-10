package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ForEachLoop {
    public static void main(String[] args) {


        //1->clean code


        List<Integer>sayiList=new ArrayList<>(List.of(16,5,2,33,22,27,41,24));
        // l,st elemanlarının aralarında boşluk olacak şekilde ayrı satırlara print ediniz

        for (int i = 0; i <sayiList.size() ; i++) {
            System.out.println(sayiList.get(i)+ " ");

        }
        for (Integer a :sayiList) {
            System.out.println(a + " ");
        }

        //task list elemanların ilk 3 eleman hariç tek olanları print ediniz

        for (Integer a : sayiList.subList(3,sayiList.size())) {
            if (a%2==1) System.out.print(a+ " ");

        }

        //task3--> 2 ile 5 index arasındaki  elemanların toplamını print edin
int toplam =0;

        for (int a : sayiList.subList(2,6)) {
            toplam+=a;
        }
        System.out.println(toplam);





    }
}
