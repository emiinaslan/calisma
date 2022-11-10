package j29_Exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileİnputStreamExaption {
    public static void main(String[] args) throws IOException {
        //public static void main(String[] args) throws IOException
        /*

        eğer bir methoda check (CTE riski olan excp ) exception varsa method signature (method name'den sonraki bölüm)
        hata uyarsı altı kırmkızı çizgi verir komutun derlemeasine izin vermez ve kod üzerine geldiğinde ad... exceptioonn haandle
        etme tavsiye eder otomatik throws exp eklenr
        bu şekilde methodu call eden komutlar try-cach' a alınması gaernri olur
         */


        FileInputStream fis =new FileInputStream("C:\\Users\\bennn\\IdeaProjects\\javaLearn1\\src\\j29_Exeptions\\ebikgabık");
        int k ;
        while ((k = fis.read())!=-1){// IOException --> evde yoksa kontrolü
            System.out.print((char) k);//k int asci olan file değeri

        }

    }
}
