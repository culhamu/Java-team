package day18_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C11_soru {
    public static void main(String[] args) {
        /*
        Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip,
        kalan kismini list olarak bize donduren bir method olusturun
         */
        List<String> isimler=C10_soru.isimListesiOlustur();
        System.out.println("istenmeyen harfin olduğu isimler silindi.\n Kalan isimler:"
                            +istenmeyenIsimleriSil(isimler));

    }public static List<String> istenmeyenIsimleriSil(List<String> isimler){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen içeren isimleri silmek için bir harf giriniz");
        String istenmeyeHarf=scan.next().substring(0,1);

        List<String> yeniListe=new ArrayList<>();

        for (int i = 0; i < isimler.size(); i++) {

            if (!isimler.get(i).contains(istenmeyeHarf)){
                yeniListe.add(isimler.get(i));
            }

        }return yeniListe;

    }
}
