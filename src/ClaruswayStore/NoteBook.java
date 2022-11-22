package ClaruswayStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoteBook extends Product {
    Scanner sc =new Scanner(System.in);
    static int nId=1;
    static List<NoteBook>noteBooks=new ArrayList<>();

    public NoteBook(String name, double price, double discountRate, int amount, Brand brand, double scerenSizeİ, int ram, int memory) {
        super(nId, name, price, discountRate, amount, brand, scerenSizeİ, ram, memory);
      nId++;
    }// obje create edebilmek için çağırdık

    public NoteBook() {
    }

    @Override
    public void menu() {

        System.out.println("1-) yeni notebook ekleme\n" +
                "2-) Notebook listesini görüntüleme\n" +
                "3-) Notebook Silme\n" +
                "4-) Markaya göre filtrelme");

        System.out.println("lütfen yapmak istediğiniz işlemi seçöiniz...");
        int options= sc.nextInt();

        if (options==1)addItem();
        if (options==2)getProducts();
        if (options==3)deleteItem();

    }


    @Override
    public void addItem() {
        System.out.println("ürün fiyatı");
        double price= sc.nextDouble();
        System.out.println("ürün adı");
        String name = sc.nextLine();
        System.out.println("indirim oranı");
        double discountRate =sc.nextDouble();
        System.out.println("ürün stoğu");
        int amount = sc.nextInt();
        System.out.println("ürünün rami");
        int ram=sc.nextInt();
        System.out.println("ürünün ekranı");
        double screenSize = sc.nextDouble();
        System.out.println("ürünün hafızası");
        int memory = sc.nextInt();
        System.out.println("lütfen marka seçiniz");
        Brand.printBrands();
        Brand brand=Brand.getBrand(sc.nextInt());
        NoteBook noteBook=new NoteBook(name,price,discountRate,amount,brand,screenSize,memory,ram);//tamamlannmadı!!!!!
        noteBooks.add(noteBook);
        System.out.println("ekran ürünün id'si :"+ noteBook.getId());


    }
public void print(List<NoteBook>noteBooks){
        //todo::

    /*for (:) {

    }


     */
}
    @Override
    public void getProducts() {
print(null);
    }

    @Override
    public void deleteItem() {
getProducts();
        System.out.println("silinmesini istediğiniz ürürn id sini giriniz");
        int id = sc.nextInt();
        noteBooks.remove(id-1);
        System.out.println("mevcut ürün listesi: ");
        getProducts();

    }

}
