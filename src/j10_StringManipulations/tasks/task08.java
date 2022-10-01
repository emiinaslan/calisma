package j10_StringManipulations.tasks;

public class task08 {
    public static void main(String[] args) {

        /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi yazdiriniz.
   String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    */
        String harfler = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       char e = harfler.charAt(harfler.indexOf('E'));
       char m = harfler.charAt(harfler.indexOf('M'));
       char i = harfler.charAt(harfler.indexOf('I'));
       char n = harfler.charAt(harfler.indexOf('N'));
        System.out.println(""+e+m+i+n);








    }
}
