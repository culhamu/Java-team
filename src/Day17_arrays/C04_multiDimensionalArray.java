package Day17_arrays;

import java.util.Arrays;

public class C04_multiDimensionalArray {
    public static void main(String[] args) {
        int [][] arr={{2,3},{1,2,3},{6,7,4,5,3},{0,5,7}};
        System.out.println(arr.length);//4
        System.out.println(arr[2].length);//5
        System.out.println(arr[2][1]);//7
        System.out.println(arr[3]);//[I@568db2f2

        System.out.println(Arrays.toString(arr[3]));//[0, 5, 7]
        System.out.println(arr[3][0]);//0
        System.out.println(Arrays.toString(arr[3]));
        System.out.println(Arrays.deepToString(arr));//[[2, 3], [1, 2, 3], [6, 7, 4, 5, 3], [0, 5, 7]]


    }
}
