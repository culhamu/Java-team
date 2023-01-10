package Day32_Sets_Maps;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C03_HashSetTreeSet {
    public static void main(String[] args) {

        //Bir HashSet ve Bir treeSet oluşturun bir loop ile içlerine rastgele 100000 sayı ekleyin
        //işlem sürelerini karşılaştırın

        Random rnd=new Random();

        int sayi;
        Set<Integer> hashSet=new HashSet<>();
        Set<Integer> treeSet=new TreeSet<>();

        Long hashBaslangic=System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {

            sayi= rnd.nextInt(1000000);
            hashSet.add(sayi);
        }Long hashBitis=System.currentTimeMillis();

        Long treeBaslangic=System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {

            sayi= rnd.nextInt(1000000);
            treeSet.add(sayi);
        }Long treeBitis=System.currentTimeMillis();

        System.out.println("HashSet süre : "+(hashBitis-hashBaslangic));//HashSet süre : 71
        System.out.println("TreeSet süre : "+(treeBitis-treeBaslangic));//TreeSet süre : 110

    }
}
