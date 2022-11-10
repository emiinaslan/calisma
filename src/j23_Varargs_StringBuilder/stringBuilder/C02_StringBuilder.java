package j23_Varargs_StringBuilder.stringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {
        // StringBuilder-> obj create etme

        StringBuilder sb1 = new StringBuilder();//default capacity 16 bit olan
        sb1.append("başarı gayrete aşıktır");
        System.out.println("sb1.length() = " + sb1.length());
        System.out.println("sb1.capacity() = " + sb1.capacity());

        sb1.append("JAVATAR");// "JAVATAR" sb1'e eklendi
        System.out.println("sb1.capacity() = " + sb1.capacity());
        System.out.println(sb1);
        sb1.append("selam").append(" ").append("olsun").append(" ").append(24).append(" ").append(true);
        System.out.println(sb1);//JAVATARselam olsun 24 true
        System.out.println("sb1.capacity() = " + sb1.capacity());

        sb1.append(" basarı gayrete asıktır");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());
        //2.yol
        StringBuilder sb2 = new StringBuilder("kevser hanıma selamlar");
        System.out.println("sb2.capacity() = " + sb2.capacity());//38
        //Trim()-> fazladan ayrılan capcity silinir
        System.out.println("sb2.length() = " + sb2.length());
        sb2.trimToSize();
        System.out.println("sb2 = " + sb2.capacity());
        //3.yol->

        StringBuilder sb3 = new StringBuilder(11);
        System.out.println("sb3.length() = " + sb3.length());
        System.out.println("sb3.capacity() = " + sb3.capacity());
        sb3.append("ebubekir bey");
        System.out.println("sb3.capacity() = " + sb3.capacity());

        //istenen bir index teki karakteri alma
        System.out.println("sb1.charAt(12) = " + sb1.charAt(12));

        //belirli aralıklardaki character'leri alma
        System.out.println("sb1.subSequence(3,13) = " + sb1.subSequence(3, 13));
        System.out.println("sb1.substring(17) = " + sb1.substring(17));
        System.out.println("sb1.substring(3,13) = " + sb1.substring(3, 13));

        //belirli bir index'teki karakter dilmek
        System.out.println("sb1.deleteCharAt(3) = " + sb1.deleteCharAt(3));

        System.out.println("sb1.delete(3,7) = " + sb1.delete(3, 7));
        //istenen karakter veya karakterleri eklemek
        System.out.println("sb3 = " + sb3);
        System.out.println("sb3.insert(4,\":)\" ) = " + sb3.insert(4, ":)"));
        String s = "güzel insan";
        // System.out.println("sb3.insert(9,s) = " + sb3.insert(9, s));
        System.out.println("sb3.insert(1,s,3,7) = " + sb3.insert(1, s, 3, 7));

        StringBuilder sb4 = new StringBuilder("nihan hanım");
        System.out.println("sb4.insert(5,\"QA team lead\",0,2) = " + sb4.insert(5, "QA team lead", 0, 2));

        // istenen index'teki karakteri değiştirme
        sb4.setCharAt(6, 'A');
        sb4.setCharAt(sb4.indexOf(" "),':');
        System.out.println("sb4 = " + sb4);
        System.out.println("sb4.insert(5,' ') = " + sb4.insert(5, ' '));
            System.out.println("sb4.insert(6,' ') = " + sb4.insert(6, ' '));

            //istenen ,ndex'e karakter yerine birden çok karakter silmek

            System.out.println("sb4.replace(8,10,\"hi\") = " + sb4.replace(8, 10, "hi"));


            //  StringBuilder obj String'e çevirme --> toString()
            System.out.println("sb3.toString().toUpperCase() = " + sb3.toString().toUpperCase());

            // String ile StringBuilder karşılaştırılması
        StringBuilder sb5=new StringBuilder("javaCAN");
        StringBuilder sb6=new StringBuilder("javaCAN");
        String str1 ="javaCAN";
        System.out.println("sb5.compareTo(sb6) = " + sb5.compareTo(sb6));
        //sb6.compareTo(str1)//CTE-> biri str biri stringBuilder

        System.out.println("sb6.equals(sb6) = " + sb6.equals(sb5));//false->SB equals==gibi çalışır ->hem value hem de ref değere bakar
        System.out.println("sb6.equals(sb6) = " + sb6.equals(sb6));

        System.out.println("str1.equals(sb6.toString()) = " + str1.equals(sb6.toString()));


    }//main sonu
}
