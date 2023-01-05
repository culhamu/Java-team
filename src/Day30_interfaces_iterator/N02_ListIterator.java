package Day30_interfaces_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class N02_ListIterator {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(9);
        sayilar.add(11);

        //tüm elementleri index kullanmadan 3 artırın

        ListIterator lit=sayilar.listIterator();
        System.out.println(sayilar);//[5, 23, 2, 9, 11]
        while (lit.hasNext()){
            Integer sayi=(Integer) lit.next();

            lit.set(sayi+3);
        }
        System.out.println(sayilar);//[8, 26, 5, 12, 14]

        //listeyi iterator kullanarak sondan başa doğru yazdırın tümünü
        // zaten sonda olduğumuz için sona gitmemize gerek yok

        while (lit.hasPrevious()){
            System.out.print(lit.previous()+" ");
        }
    }
}
