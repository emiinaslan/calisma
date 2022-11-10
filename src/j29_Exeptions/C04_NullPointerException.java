package j29_Exeptions;

public class C04_NullPointerException {
    public static void main(String[] args) {
        //NullPointerException-) Null ataması yapılabn bir stringte lenght() method run edildiğinde oluşan RTE exception
        String str ="";
        System.out.println("str.length() = " + str.length());


       // System.out.println("str1.length() = " + str1.length());//NullPointerException
        try {
            String str1=null;
            System.out.println("str1.length() = " + str1.length());//NullPointerException

        }catch (NullPointerException e){
            System.out.println("null  String'in leght'i olurmu ? ");
        }
        try {
            String str1=null;
            System.out.println("str.length() = " + str1.length());//NullPointerException
            System.out.println("bu yazıyı okluduysan try block çalıştı demektir");

        }catch (NullPointerException e){
            System.out.println("null  String'in leght'i olurmu ? ");
        }
        System.out.println("burayı okuduıysan kodun sonuna geldin");

    }
}
