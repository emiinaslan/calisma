package j10_StringManipulations;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {
        String sehir="istanbul";
        System.out.println("sehir.charAt(sehir.length()-1) = " + sehir.charAt(sehir.length() - 1));//son harfi lenght ()-1


        Scanner sc= new Scanner(System.in);
        System.out.println("kelime gir");
        String kelime= sc.nextLine();

        if (kelime.length()%2!=0) {
            System.out.println(kelime.charAt((kelime.length()-1)/2));

        }else System.out.println("yok");


    }
}
