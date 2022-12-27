package Day17_arrays;

import java.util.Arrays;

public class C01_binarySearch {
    public static void main(String[] args) {
        int[] arr={2,8,4,1,9,3,6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 6, 8, 9]
        System.out.println(Arrays.binarySearch(arr,2));//1
        //olmayan bir element aradığımızda ne olur?
        System.out.println(Arrays.binarySearch(arr,0));//-1
        System.out.println(Arrays.binarySearch(arr,5));//-5
        System.out.println(Arrays.binarySearch(arr,15));//-8
        //olmayan bir elemnti binarysearch iile aratırsanız
        //önce listede olsaydı kaçıncı sırada olur ona bakar o sırayı - ifade ile döndürür

    }
}
