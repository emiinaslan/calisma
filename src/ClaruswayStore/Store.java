package ClaruswayStore;

import java.util.Scanner;

public class Store {
    Scanner sc =new Scanner(System.in);

    public void run(){
        System.out.println("CW Store Manegent Panaeline HG ");
        System.out.println("1-) Notebook İşlemleri\n"+
                "2-) Marka listeleme\n+" +
                "3-)Çıkış yap\n");

        System.out.println("lütfen yapmak istediğini zişlemiğ seçini");

        switch (sc.nextInt()){
            case 1:
                NoteBook noteBook =new NoteBook();
                noteBook.menu();
                break;

            case 2:
                Brand.printBrands();
                break;

            case 3:
                System.out.println("çıkış yqapıluıyor");
                System.exit(0);
                break;

        }



    }
}
