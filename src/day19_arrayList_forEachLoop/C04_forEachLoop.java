package day19_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C04_forEachLoop {
    public static void main(String[] args) {
        Integer [] arr={2,65,4,48,5,3121,8,9};
        List<Integer> list1=new ArrayList<>();
        //array deki tüm elementleri list e koplayalım
        for (Integer  each:arr) {
            list1.add(each);
        }
        System.out.println(list1);
        //array deki çift sayıları oluşturacagımız bir liste taşıyalım
        List<Integer> ciftSayilarlist=new ArrayList<>();

        for (int each:arr) {
            if (each%2==0){
                ciftSayilarlist.add(each);
            }

        }
        System.out.println(ciftSayilarlist);
    }
}
