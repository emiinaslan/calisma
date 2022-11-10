package j23_Varargs_StringBuilder.Varargs;

public class Task03 {
    public static void main(String[] args) {

        //Girilen stringlerin

        int sayı = 5;
        String str = "muharrem";
        String str2 = "ugur";
        String str3 = "ebikgabık";
        carpTopla(sayı, str, str3, "JavaCan", str2);
        StringBuilder str1 = new StringBuilder("hello");
        str1.append("esma");

        System.out.println(str1);
        String str34="esma";
        str34.concat("hello");
        System.out.println(str34);



    }//

    public static void carpTopla(int a, String... b) {
        String toplanacak = "";
        for (String s : b
        ) {
            if (s.length() > toplanacak.length()) {
                toplanacak = s;


            }


        }
        System.out.println("en uzun kelime: " + toplanacak + "'ın lenght'i: " + toplanacak.length() + "\n" + (a * toplanacak.length()) + "\nenuzun kelime: " + toplanacak);

    }


}
