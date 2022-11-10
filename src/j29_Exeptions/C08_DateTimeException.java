package j29_Exeptions;

import java.time.DateTimeException;
import java.time.LocalDate;

public class C08_DateTimeException {
    public static void main(String[] args) {
        /*
        DateTimeException-)
         */
        //LocalDate date=LocalDate.of(2022,11,33);
       // System.out.println("date = " + date);//DateTimeException
        try {
            LocalDate date=LocalDate.of(2022,11,30);
            System.out.println("try block çalıştı");

        }catch (DateTimeException e){

            System.out.println("catch block çalıştı"+"\nHata aldın hatanın adı: "+e);

        }
        System.out.println("code sonuna kadar çalıştı");
    }
}
