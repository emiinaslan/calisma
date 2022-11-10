package j23_Varargs_StringBuilder;

public class Task01 {
    public static void main(String[] args) {
        System.out.println("tersString(\"ece\") = " + tersString("ece"));
tersSb(new StringBuilder("emin"));
        System.out.println("isPalindrom(\"ey edip adanada pide ye\") = " + isPalindrom("ey edip adanada pide ye"));
        System.out.println("isPalindrom(\"aga\") = " + isPalindrom("aga"));
        System.out.println("isPalindrom(\"emin\") = " + isPalindrom("emin"));


    }// main sonu
    public static String tersString(String str){//amele code
        String StringTersi ="";
        for (int i = str.length()-1; i >=0; i--) {
            StringTersi+=str.charAt(i);
        }
        return StringTersi;
    }

    public static void tersSb(StringBuilder sb){
        System.out.println("sb.reverse() = " + sb.reverse());

    }


    public static boolean isPalindrom (String str){
        if (str==null){
            return false;
        }
        return new StringBuilder(str).reverse().toString().equals(str);
    }

}
