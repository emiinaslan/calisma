package j29_Exeptions;

public class C07_İllegalargumentException02 {
    public static void main(String[] args) {

        try {
            System.out.println("try block'un başı çalıştı");
            hata();
            System.out.println("try block'un sonu çalıştı");
        }catch (IllegalArgumentException e){
            System.out.println("catch blok'un başından");
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("catch blok'un sonndan");
        }
        System.out.println("sorun handle edildi codun sonuna geldi");
    }//main sonu
    public static void hata(){
        throw new IllegalArgumentException("hatasız kul olmaz");
    }
}
