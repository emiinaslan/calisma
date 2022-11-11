package j32_Abstract;

public class C01_Abstract {
    /*
    çözüm olarak java parent class'a body'siz abstract (soyut) methodlar tanımlamıştır
    2-) parent class'daki abstarct methodlar aplication güvenliği açısından child class'ta ovirride edilmek zorundadır
    eğr parent  class'ın  mutlaka kullanılması gereken method varsa
    3-) abstract method tanımlamak için
    a.{} body olmaz
    b. access modief sonrası abstract keyword kullanılmalı
    c. abstract method içinde abstract
    abstract
    4-) abstract methodlar sadece abstract methodta tanımlanır kesinlikle concrate Class'ta tanımlanamaz
    ama abstract class'da concrate method tanımlana bilir
    5-) abstract Class için de hem abstract method hem de concrate method tanımlanabilir.
    6-) bir concrate child class parent abstract class extend ettiğinde abstract method'ları Implement
    7-) parent child ilişkisi olan abstract class lar abstract methodları Implement etmek zorunda değil
    8-) Parent olan abstract class bir den çok conrate veya abstart child class extend edebilir
    ancak child class birden çok abstract parent class'dan exdent edemez
    9-) abstract Class'da final ve abstarct method tanımlanamaz
    10-)abs class'da private ve abstract method tanımlanamaz (CTE)
    11-) abstract Class'da static ve abstract method tanımlanamaz (CTE)

    ********  ABSTRACT CLASS KESİNLİKLE OBJE ÜRETEMEZ*************

    TRİCK-> abstract classlar referansını child class'ın objesini tutabilir ()



     */
}
