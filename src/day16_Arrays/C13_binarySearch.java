package day16_Arrays;

import java.util.Arrays;

public class C13_binarySearch {
    public static void main(String[] args) {
        //binary siralama javanın kullandığı özel bir sıralamadır

        int[] arr={2,6,9,3,15,1,7};//önce sırala


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 3));//index döner 2


    }
}
