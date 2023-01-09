package Day31_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C06_ArraydekiTekrarlardanKurtulma {
    public static void main(String[] args) {
        /*
        verilen bir array deki tekrar edilen elementleri sadece bir kere yazarak
        array i kısaltan kod yazın
         */

        int[] arr={1,2,3,4,5,6,1,2,3,4,5,6,1,2,3,4,5,6};

        Set<Integer> arrSet=new HashSet<>();
        //array deki tüm elementleri ,Set e ekleyelim

        for (Integer w:arr) {
            arrSet.add(w);
        }
        System.out.println(arrSet);//[1, 2, 3, 4, 5, 6]

        //Set'deki element sayısına eşit bir array oluşturup
        //Set'deki elementleri oraya taşıyalım

        arr=new int[arrSet.size()];

        int index=0;
        for (Integer w:arrSet) {
            arr[index]=w;
            index++;
        }
        System.out.println("Array'in son hali : "+Arrays.toString(arr));//Array'in son hali : [1, 2, 3, 4, 5, 6]
    }
}
