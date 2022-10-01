import java.util.Scanner;

public class C06_substring {
    public static void main(String[] args) {
        String str = "java bilenin sırtı yere gelmez";
        System.out.println(str.substring(str.length() - 10));
        System.out.println(str.substring(0, 1));

        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen 4 haneli kelime giriniz :");
        String harf = sc.nextLine();
        if (harf.length() != 4) {
            System.out.println("4 hanaeli kelime gir");

        } else System.out.print(harf.substring(3, 4));
        System.out.print(harf.substring(2, 3));
        System.out.print(harf.substring(1, 2));
        System.out.print(harf.substring(0, 1));


    }
}
