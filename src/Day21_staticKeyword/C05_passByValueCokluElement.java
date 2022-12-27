package Day21_staticKeyword;

import java.util.Arrays;

public class C05_passByValueCokluElement {
    public static void main(String[] args) {

        int[] arr={3,6,9,1,7};
        //bir method oluşturup arr yi methoda yollayalım
        //methodda arr üzerinde değişiklik yapalım ve arr yazdıralım

        elementleriDegistir(arr);//[13, 6, 19, 1, 7]
        System.out.println(Arrays.toString(arr));//[13, 6, 19, 1, 7]


    }public static void elementleriDegistir(int[] b){

        b[0]=13;
        b[2]=19;

        System.out.println(Arrays.toString(b));

    }
}
