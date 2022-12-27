package Day16_Arrays;

import java.util.Arrays;

public class C01_arrays {
    public static void main(String[] args) {
        String [] arr1=new String[4];//null,null,null,null
        int [] arr2= {2,3,4,5,6};
        System.out.println(arr2[2]);//4
        System.out.println(arr1[2]);//null
        //System.out.println(arr1[8]);//ArrayIndexOutOfBoundsException
        arr2[2]=15;
        arr2[0]=7;
        System.out.println(Arrays.toString(arr2));//bu method Stringe çevirir
    }
}
