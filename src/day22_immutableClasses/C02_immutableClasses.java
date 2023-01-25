package day22_immutableClasses;

import java.util.Arrays;

public class C02_immutableClasses {
    public static void main(String[] args) {
        String str="Java";
        System.out.println(str.toUpperCase());//JAVA
        str.toLowerCase();

        System.out.println(str);//Java
        //String immutable olduğundan kalıcı değişiklik yapılmaz

        int[] arr={9,5,17};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));//[5,9,17]

        //array mutable olduğu için atama olmasa bie atama yapmadan değerler kalıcı olur


    }
}
