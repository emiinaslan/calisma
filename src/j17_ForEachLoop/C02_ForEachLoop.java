package j17_ForEachLoop;

public class C02_ForEachLoop {
    public static void main(String[] args) {
        // array elemanlarının çarpımını prit eden code creare ediniz
        int arr [][]={{2,3},{4},{5,6,7}};
        int çarpım =1;
        for (int kc[]:arr) {
            for (int a :kc) {çarpım*=a;

            }

        }
        System.out.println(çarpım);
    }
}
