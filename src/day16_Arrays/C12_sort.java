package day16_Arrays;

import java.util.Arrays;

public class C12_sort {
    public static void main(String[] args) {
        //verilen bir arrayi natural ordera göre sıralayıp yazdırın
        String[] isimler={"huseyin","akile","yusuf","mehmet","said"};
        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));//sıraya göre sıraladı
                                                        //[akile, huseyin, mehmet, said, yusuf]

        //eğer büyükten küçüğe sıralamak istersek
        //önce natural ordera göre sıralar
        //sonra geçici array kullanara sıralama terse çevrilir

    }
}
