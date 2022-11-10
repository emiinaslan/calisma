package j15_Arrays;

public class Q4_Arrays {
    public static void main(String[] args) {

        int arr[]={5,7,-6,4,2,15,3,8,1};
        int istenenToplam= 9;
        toplamDokuz(arr,istenenToplam);

    }

    private static void toplamDokuz(int[] arr, int istenenToplam) {
        for (int i = 0; i+1 < arr.length; i++) {
            for (int j = i ; j <arr.length ; j++) {
                if (arr[i]+arr[j]==istenenToplam){
                    System.out.println(arr[i]+ "+"+ arr[j]+ " toplam :"+ istenenToplam );
                }

            }
        }
    }
}
