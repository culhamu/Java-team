package Day17_arrays;

import java.util.Arrays;

public class C05_MDA {
    public static void main(String[] args) {

        int [][] arr={{2,3},{1,2,3},{6,7,4,5,3},{0,5,7}};
        // verilen 2 katlı mda daki tümsayıların toplamını yazdıran bir method oluşturun

        tumSayilariTopla(arr);

    }public static void tumSayilariTopla(int[][] arr){
        int toplam=0;
        for (int i = 0; i <=arr.length-1 ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                toplam+=arr[i][j];


            }


        }System.out.println(toplam);
    }
}
