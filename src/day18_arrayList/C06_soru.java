package day18_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_soru {
    public static void main(String[] args) {
        //verilen bir arrayi tekrar ednleri silip eşsiz yapın
        int [] sayilar={4,3,5,8,4,4,6,64,64,84,51,1,1,15,16,1,51,1,8,4,51,2};

        List<Integer> benzersizElementlerListesi=new ArrayList<>();
        for (int i = 0; i < sayilar.length; i++) {
            if (!benzersizElementlerListesi.contains(sayilar[i])){
                benzersizElementlerListesi.add(sayilar[i]);
            }

        }
        System.out.println(benzersizElementlerListesi);

        sayilar=new int[benzersizElementlerListesi.size()];
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i]=benzersizElementlerListesi.get(i);



        }
        System.out.println("Arrayin son hali: "+ Arrays.toString(sayilar));
    }
}
