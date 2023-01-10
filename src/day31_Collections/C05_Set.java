package day31_Collections;

import java.util.Set;
import java.util.TreeSet;

public class C05_Set {
    public static void main(String[] args) {
        //Set index yapısını desteklemez

        Set<String> ogrenciler=new TreeSet<>();//doğal sıralı treeSet

        ogrenciler.add("Esra");
        ogrenciler.add("Ayten");
        ogrenciler.add("Furkan");

        System.out.println(ogrenciler);//[Ayten, Esra, Furkan]

        ogrenciler.add("Ahmet");
        System.out.println(ogrenciler);//[Ahmet, Ayten, Esra, Furkan]

        ogrenciler.add("Furkan");
        System.out.println(ogrenciler);//[Ahmet, Ayten, Esra, Furkan] eski furkanı siler yerine yenisini ekler
    }
}
