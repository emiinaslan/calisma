package j23_Varargs_StringBuilder.Varargs;

public class C01_Varags {
    public static void main(String[] args) {
/*
        VARARGS :
        var----variety cesitlilik args---arguments
        SYNTAX ->
        mathodName(parametre1,parametre2, dataType... dataName) {
        meyhod budy....
        }

	        1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır .CISS
		    2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :CISS

           Gunun TRICK'i  köşesinde böyün :
           Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
           ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli
         */

        // Task -> verilen iki sayı toplamını print eden METHOD create ediniz
int sayı=24;
int sayı1=27;
int sayı2=46;
int sayı3=10;
topla(sayı,sayı1);
topla(sayı3,sayı1);
topla(sayı1,sayı3);
topla(sayı,sayı1,sayı2);
//task-> verilen String'lerin en fazla  karaktere sahip olanı print eden method create ediniz
enUzunKelime("mehmet","ali","hüsamettin");


    }//main sonu

    public static void topla (int a,int b){
        System.out.println("sayılar toplamı: "+ (a+b) );
    }

    public static void topla (int a,int b,int c){
        System.out.println("sayılar toplamı: "+ (a+b+c) );
    }
    public static void toplaVarargs(int...a){
        int toplam =0;
        for (int w:a) {
            toplam+=w;
        }
        System.out.println("toplam = " + toplam);


    }

public static void enUzunKelime(String...str){


        String enUzun="";
    for (String w : str) {
        if (w.length()>enUzun.length()){
            enUzun=w;
        }

    }
    System.out.println("en uzun:"+ enUzun);
}

}
