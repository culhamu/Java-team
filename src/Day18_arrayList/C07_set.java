package Day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_set {
    public static void main(String[] args) {
        // javada bir çok yyapıda get ve set methodlatı bulunur
        //get=bilgiyi getirir
        //set=update yani günceller

        List<String> harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");

        harfler.add(2,"F");
        System.out.println(harfler);//[A, Z, F, T]

        harfler.set(2,"M");
        System.out.println(harfler);//[A, Z, M, T] var olan veriyi günceller

    }
}
