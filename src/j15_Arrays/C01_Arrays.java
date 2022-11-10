package j15_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
//Array tanımlama
        int a ; // declare dilen aama atanmayan primitive data
        int arr [];

        String isimArr[]={"enise","muharrem","cebrail","nazım","özge",};//hem tanımlama hem atama yapılan string array

int sayıArr[]=new int[5];//java heap memorhy 5 default --> olan int array create edildi

        //Array a eleman ekleme
        sayıArr[2]=34;
        sayıArr[0]=35;
        sayıArr[1]=34;
        sayıArr[3]=61;
        sayıArr[0]=34;
                     //arry elamanları unige olmak zoruında değildir tekrarlı elemanları olabilir.

        //array eleman sayısı boyut  değeri
        System.out.println("sayıArr.length = " + sayıArr.length);

        //array son elaman

        System.out.println("isimArr[isimArr.length-1] = " + isimArr[isimArr.length - 1]);
isimArr[isimArr.length-1]="QA özge hanım";//Arry son eleman uptade edildi


        //Array de olamayan eleman
       // okkalı bir Trıck---> sayıArr[11]=23;//CTE vermez ama olmayan eleman rte verir -->array run time de oluşur




        // Array elemanlarını yazdırır msnz
        for (int i = 0; i < sayıArr.length; i++) {
            System.out.println(isimArr[i]);
        }
        System.out.println("Arrays.toString(isimArr) = " + Arrays.toString(isimArr));

// task --> saıArr elemanlarından değeri tek olanları print eden code create ediniz
        for (int i = 0; i <sayıArr.length ; i++) {
            if (sayıArr[i] % 2==1){
                System.out.println(sayıArr[i]);

            }
        }

//Task -->saıArry çift iindex elemanlarını prin eden code create ediniz
        for (int i = 0; i < sayıArr.length ; i+=2) {
            System.out.println(sayıArr[i]+ "");
        }


// task --> isimArry 5 harfli elemanlarından oluşan arryın
        String yeniArry[]=new String[isimArr.length];
        for (int i = 0; i <isimArr.length ; i++) {
            if (isimArr[i].length()==5){
                yeniArry[i]=isimArr[i];

            }
        }
        System.out.println("Arrays.toString(yeniArry) = " + Arrays.toString(yeniArry));
        //Array elemanları naturel (k>bbascendik b>k : descending alfabetik) sıralama
        System.out.println(Arrays.toString(isimArr));
        Arrays.sort(isimArr);// elemanları naturel sıralama yapıldı
        System.out.println(Arrays.toString(isimArr));

    }// main sonu
}
