package day32_Sets_Maps;

import java.util.Map;

public class C09_NumaraIleSubeGuncelleme {
    public static void main(String[] args) {
        //Numarası verilen öğrencinin şube ismini verilen sube yapan bir method oluturun

        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.numaraIleSubeDegistirme(ogrenciMap, 104, "M");
        MapMethodDepo.numaraIleSubeDegistirme(ogrenciMap, 101, "L");
        System.out.println(ogrenciMap);
    }
}
