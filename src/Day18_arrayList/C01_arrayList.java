package Day18_arrayList;

import Day16_Arrays.C10_arrayeBirElementEkleme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_arrayList {
    public static void main(String[] args) {

        String[] arr={"A","B","T"};
        //bu stringe element eklement istersek
       arr= C10_arrayeBirElementEkleme.arrayeElementEkleme(arr,"C");
        System.out.println(Arrays.toString(arr));//A,B,T,C
        //arrayList esnek uzunluktaki bir arraydir
        //ancak arrayList array alt yapısını kullundığından tek tek ekler

        List<String>harfler=new ArrayList<>();
        System.out.println(harfler);//[]
        harfler.add("a");
        harfler.add("b");
        harfler.add("c");
        System.out.println(harfler);//[a, b, c]
        harfler.add(1,"g");
        System.out.println(harfler);//[a, g, b, c]
        List<String> karakterler=new ArrayList<>();
        karakterler.add("*");
        karakterler.add("#");

        harfler.addAll(karakterler);

        System.out.println(harfler);//[a, g, b, c, *, #]
        harfler.addAll(2,karakterler);
        System.out.println(harfler);//[a, g, *, #, b, c, *, #]
    }
}
