package day17_arrays;

import java.util.Arrays;

public class C02_equals {
    public static void main(String[] args) {
        int[] arr1={3,8,0};
        int[] arr2={8,3,0};
        System.out.println(Arrays.equals(arr1,arr2));//false
        // equals method hem elementleri hem de indexleri kontrol eder

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2));//true

    }
}
