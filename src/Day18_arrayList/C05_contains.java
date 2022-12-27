package Day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_contains {
    public static void main(String[] args) {
        int[] arr={4,5,8,3,1,45,68,7};
        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i] );

        }
        System.out.println(sayilar);//[4, 5, 8, 3, 1, 45, 68, 7]

        System.out.println(sayilar.contains(8));//true
        System.out.println(sayilar.contains(2));//false
    }
}
