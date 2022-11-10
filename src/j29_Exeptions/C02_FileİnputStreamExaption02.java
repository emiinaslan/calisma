package j29_Exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileİnputStreamExaption02 {
    public static void main(String[] args) {

        try {
            int k;
            FileInputStream fis = new FileInputStream("C:\\Users\\bennn\\IdeaProjects\\javaLearn1\\src\\j29_Exeptions\\ebikgabı");

                try {
                    while ((((k = fis.read()) != -1))) {

                        System.out.print((char) k);
                    }

                    System.out.println("ağam içteki try block çalıştı ");
                } catch (IOException e) {
                    System.out.println("dosya okunamıyor");
                    System.out.println("içteki catch block");

                }
                System.out.println(" dıştaki try block çalıştı");

        } catch (FileNotFoundException e) {

            System.out.println("dıştaki catch bloktan selamlar");
        }
    }

}
