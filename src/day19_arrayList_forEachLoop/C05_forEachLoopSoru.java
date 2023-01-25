package day19_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_forEachLoopSoru {
    public static void main(String[] args) {
        /*
        Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip,
         tum elemanlardan sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.
         */
        Integer [] arr={2,65,4,48,5,3121,8,9,21,5,2,4,2,9,8,13,15};
        List<Integer> list1=new ArrayList<>();
        for (Integer each:arr) {
            if (!list1.contains(each)){
                list1.add(each);
            }

        }
        arr=new Integer[list1.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=list1.get(i);

        }
        System.out.println("Arrayin yeni hali: " + Arrays.toString(arr));
    }
}
