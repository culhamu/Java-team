package day30_interfaces_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class N01_Iterator {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(9);
        sayilar.add(11);

        System.out.println(sayilar);//[5, 23, 2, 9, 11]

        //index yapısı kullanmadan her bir elementi 3 artıralım

        for (int w:sayilar) {
            w=w+3;
            System.out.print(w);
        }

        //index yapısını kullanmadan tüm elementleri yazdırın

        Iterator itr=sayilar.iterator();

        System.out.println(itr.next());//5
        System.out.println(itr.next());//23
        System.out.println(itr.next());//2
        System.out.println(itr.next());//9
        System.out.println(itr.next());//11

        //tektek yapmayıp birloopile yapalım

        System.out.println(itr.hasNext());//false

        //iterator da geri dönüş yok nereye gittiyse orada kalır
        //tüm listeyi loop ile yeniden yazdırmak için yeni itr oluştırmak lazım veya itr yeni değer atamalıyoz

        itr=sayilar.iterator();

        System.out.println(itr.hasNext());//true

        while (itr.hasNext()){
            System.out.print(itr.next()+" ");//5 23 2 9 11


        }

        //itr kullanarak 5 den büyük sayıları silin

        itr=sayilar.iterator();

        while (itr.hasNext()){

            Integer sayi=(Integer) itr.next();

            if (sayi>5){
                itr.remove();
            }
        }
        System.out.println("");
        System.out.println(sayilar);//[5, 2]


    }
}
