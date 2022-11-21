package day3;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import java.util.RandomAccess;

public class Q02_CreateRandomList_SetList {
    // int array list oluşturun 10 elemandan oluşmalı//
// random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.//
// bu metod array list içinde 0' dan 20 ye kadar değer atasın.
// eğer çift sayı atarsa o elemanının yerine 111 yazsın
// eğer çift sayı yoksa çift sayı yoktur mesajını versin.

    public static void main(String[] args) {

        ArrayList<Integer>arrayList=new ArrayList<>();

        randomEkle(arrayList);
    }

    public static void randomEkle(ArrayList<Integer> arrayList) {
        for (int i = 0; i < 10 ; i++) {
            arrayList.add((int) (Math.random()*20));

        }
        System.out.println(arrayList);//random satılardan olusan ksite
        int counter=0;
        for (int i = 0; i <arrayList.size() ; i++) {
            if (arrayList.get(i)%2==0){
                counter++;
                arrayList.set(i,111);// o elemanın yerine 111


            }
        }
        System.out.println(arrayList);//set edilmiş halini verecek
        if (counter==0){
            System.out.println("çift sayı yoktur");
        }
    }


}
