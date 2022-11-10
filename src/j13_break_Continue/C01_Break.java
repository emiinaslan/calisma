package j13_break_Continue;

import java.util.Scanner;

public class C01_Break {
    public static void main(String[] args) {
        /*
break oradan sonlandırmak için döngüyü kontrol edebiliriz.Bir loop'u, loop'un koşul bölümüne bağlı
kalmaksızın sona erdirmek için break komutu kullanılır. break komutu loop'a bağlı kod bloğunun
 herhangi bir işlem satırında yer alabilir. Program kod bloğunda break komutu'nu görür görmez,
 loop başlangıç koşulu sağlanmış olsa bile, loop'dan çıkar ve loop'dan sonra gelen ilk işlem
 satırından çalışmasına devam eder. İç içe(nested) looplarda break komutu kullanıldığında sadece
  içinde kullanıldığı loop'dan çıkışı sağlar:


 temelde döngüden atlamak için kullanılır, çoğunlukla if-else deyimi ile kullanılır
 */

// Task ->girilen bir mail hesabının @ sembolune kadar olan karakterlerni print eden code create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("mail girniz :");
        String mail = sc.nextLine();
        for (int i = 0; i < mail.length(); i++) {//0 index ten mail indexe kadar her karakteri döngüye al
            char c = mail.charAt(i);//döngüde kii her bir karakteri c ye atar
            if (c == '@') {// c de @ karakteri varsa if blok run edilir
                break;
            }
            System.out.print(c);
        }


    }// main sonu
}
