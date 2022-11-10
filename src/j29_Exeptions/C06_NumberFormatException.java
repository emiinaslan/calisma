package j29_Exeptions;

public class C06_NumberFormatException {
    public static void main(String[] args) {
      /*
      NumberFormatException -) sayı formatında olmayan bir data yı paseInt() method runn ederek integere cevirildiğinde oluşan rte exception
      java da String içiçnde ki ra karakterlere parseInt() method ile ınt değere atanabilir
       */
        String str = "1453";
        System.out.println("str+5 = " + str + 5);//14535 ->concat edliir
        int sayı = Integer.parseInt(str);//str dki rakam karakter sayı veriablına atandı
        System.out.println(sayı);
        System.out.println("sayı+5 = " + (sayı + 5));

        String id = "57l622";
        //System.out.println("Integer.parseInt(id) = " + Integer.parseInt(id));//NumberFormatException
        try {
            System.out.println("Integer.parseInt(id) = " + Integer.parseInt(id));
            System.out.println("try block çalıştı");

        }catch (NumberFormatException e){
            System.out.println("catch block çalıştı");
        }try {
            System.out.println("Integer.parseInt(id) = " + Integer.parseInt(str));
            System.out.println("try block çalıştı");

        }catch (NumberFormatException e){
            System.out.println("catch block çalıştı");
        }
        System.out.println("kodun sonuna geldin çalıştı");


    }
}
