package j15_Arrays;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        //Task--> $ ve £ olanların toplamını ayrı ayrı bulup yazdıran code creater ediniz
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4";
        int toplamDolar =0;
        int toplamSterlin=0;

String para[]=str.split(" ");
        System.out.println(Arrays.toString(para));
        for (int i = 0; i <para.length ; i++) {
            if (para[i].contains("$")){
               toplamDolar+=Integer.parseInt(para[i].replace("$",""));

            }else toplamSterlin+=Integer.parseInt(para[i].replace("£",""));
        }
        System.out.println(toplamDolar);
        System.out.println(toplamSterlin);

    }
}
