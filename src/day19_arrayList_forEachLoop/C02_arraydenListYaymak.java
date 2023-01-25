package day19_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_arraydenListYaymak {
    public static void main(String[] args) {
        Integer [] arr={2,65,4,48,5,3121,8,9};
        List<Integer> list1=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list1.add(arr[i]);

        }
        System.out.println(list1);//1. yöntem


        List<Integer> list2= Arrays.asList(arr);
        System.out.println(list2);

        list2.add(6);//hata verdi
        //aslist ile oluşturulan list arratden dönüştürüldüğü için add remove gibi size değiştiren methodlar kullanılamaz
       /* 2- asList() kullanmak
        cok tavsiye etmiyoruz, cunku 2 buyuk dezavantaji var
                - asList ile olusturulan list, array'den donusturuldugu icin
        add, remove gibi size'i degistiren methodlar kullanilamaz
                - asList() ile olusturulan list ile bagli oldugu array
        birbirinden ayrilmiyor
        birinde yapacagimiz degisiklik, otomatik olarak digerini de etkiliyor

        */
    }
}
