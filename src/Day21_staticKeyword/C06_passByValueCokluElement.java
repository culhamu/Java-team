package Day21_staticKeyword;

import java.sql.Array;
import java.util.Arrays;

public class C06_passByValueCokluElement {
    public static void main(String[] args) {

int[] arr={3,6,8};
//bir metot oluşturun method da 5 elementli yeni bir array atayın ve yazdirin
        //main metot da yeni arrayi yazdırın

arrayDegistir(arr);
        System.out.println(Arrays.toString(arr));
    }public static void arrayDegistir(int[] b){
        b=new int[5];
        System.out.println(Arrays.toString(b));

    }
}
