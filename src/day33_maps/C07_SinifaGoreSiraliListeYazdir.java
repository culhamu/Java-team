package day33_maps;

import day32_Sets_Maps.MapMethodDepo;

import java.util.Map;

public class C07_SinifaGoreSiraliListeYazdir {
    public static void main(String[] args) {
        /*
        tüm öğrenci listesini
        sinıf sube isim soyisim no seklinde
        doğal sıralı olarak
        yazdıran method oluşturun
         */
        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();
        MapMethodDepo.sinifSiraliListeOlustur(ogrenciMap);
    }
}
