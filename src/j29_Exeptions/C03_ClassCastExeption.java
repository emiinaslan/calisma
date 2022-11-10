package j29_Exeptions;

public class C03_ClassCastExeption {
    public static void main(String[] args) {
        Object obj = "javaCAN'lara selam olsun";
        String str = (String) obj;
        System.out.println("str = " + str);

        Object sayi1 = 10;
        // String str2= (String) sayi1;
        //System.out.println("str2 = " + str2);

        try {
            String str2 = (String) sayi1;
        } catch (ClassCastException e) {
            System.out.println("ağam int object hiç stringe çevrilir mi ?");

        }


        try {

            String str3 = (String) obj;
            System.out.println("agam try block da bu yazıyı okuduysan excp fırmlatmadı komut sorunsuz ");

        } catch (ClassCastException e) {
            System.out.println("ağam int object hiç stringe çevrilir mi ?");

        }
        System.out.println("bu kod çalışırsa program kırılmadan run olmuştur");

    }
    //ClasCastException-) birbirine dönüştürülemeyen data typ'lar birbirine dönüştürüldüğünde oluşan RTE
}
