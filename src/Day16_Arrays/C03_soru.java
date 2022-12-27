package Day16_Arrays;

import java.util.Arrays;

public class C03_soru {
    public static void main(String[] args) {
        // verilen bir integer array deki tüm elementleri 5 artırın
        int[] arr={2,4,6,8};//tüm elementleri kontrol dediği için forloop devereye girer
        for (int i = 0; i <arr.length ; i++) {
            arr[i]+=5;

        }
        System.out.println(Arrays.toString(arr));
    }
}
