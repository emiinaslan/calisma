package j99_Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class C12_textRead {
    public static void main(String[] args) throws IOException {
        System.out.println("\n TASK01===> Emin dosyasını okuyunuz");
        Path emn =Path.of("src\\j99_Lambda\\emin");//Erişilecek  dosyanıon path'i tanımlandı
        Stream<String> akis= Files.lines(emn);
       // Stream<String> akis1= Files.lines(Path.of("src\\j99_Lambda\\emin"));
        akis.//erişimi verilen dosyadaki satırlar akışa alındı
                forEach(System.out::println);//akıştaki satırlar(Lines) print edildi

        //TASK 02 --> emin.txt dosyasini buyuk harflerle okuyunuz.(Console'a buyuk harflerle print ediniz.)
        System.out.println("\n TASK02===> Emin dosyasını BÜYÜK harfle okuyunuz");
        Files.
                lines(Paths.get("src\\j99_Lambda\\emin")).//erişim verilen path deki satırlar akısa alındı
                map(String::toUpperCase).//akısdaki satırlar büyük harf update edildi
                forEach(System.out::println);
        //TASK 03 --> emin.txt dosyasindaki ilk satiri kucuk harflerle print ediniz..
        System.out.println("\n TASK03===> Emin dosyasındaki ilk satırı küçük harfle print ediniz");
        Files.
                lines(Paths.get("src\\j99_Lambda\\emin")).
                map(String::toLowerCase).limit(1).
                forEach(System.out::println);
        //TASK 04 --> emin dosyasinda "basari" kelimesinin kac satirda gectiginiz print ediniz.
        System.out.println("\n TASK03===> emin dosyasinda \"basari\" kelimesinin kac satirda gectiginiz print ediniz");
        System.out.println(Files.
                lines(Paths.get("src\\j99_Lambda\\emin")).map(String::toLowerCase).filter(t -> t.contains("basari")).count());

    }//main sonu



}//clas sonu
