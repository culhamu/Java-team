package Day17_arrays;

import java.util.Arrays;

public class C07_MDA_Soru {
    public static void main(String[] args) {
        /*
        Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
        olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        input : int[][] arr = {{3,4,5}, {2,3,6,7}};
        output: [5, 7, 11]
         */
        int[][] arr = {{3,4,5}, {2,3,6,7}};


        //dinamik hale getirmek için önce inner array'lerden en kısa olanı bulmak gerekir

       int enKısaArrayLenght=arr[0].length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length<enKısaArrayLenght){
                enKısaArrayLenght=arr[i].length;
            }

        }
        int toplam=0;

        int [] toplamlar=new int[enKısaArrayLenght];
        for (int i = 0; i < enKısaArrayLenght; i++) {
            for (int j = 0; j < arr.length; j++) {
                toplam+=arr[j][i];

            }
            toplamlar[i]=toplam;
            toplam=0;

        }
        System.out.println(Arrays.toString(toplamlar));

    }
}
