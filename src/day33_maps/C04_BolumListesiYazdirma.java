package day33_maps;

import day32_Sets_Maps.MapMethodDepo;

import java.util.Map;

public class C04_BolumListesiYazdirma {
    public static void main(String[] args) {
        /*
        verilen bölümdeki öğrencilerin
        No, isim soyisim ve siniflarını yazdıran bir method oluşturun
         */

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();
        MapMethodDepo.bolumListesiOlusturma(ogrenciMap,"MF");
    }
}
