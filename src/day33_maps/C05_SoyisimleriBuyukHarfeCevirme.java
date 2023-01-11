package day33_maps;

import day32_Sets_Maps.MapMethodDepo;

import java.util.Map;

public class C05_SoyisimleriBuyukHarfeCevirme {
    public static void main(String[] args) {
        /*
        Map’deki soyisimleri buyuk harfe ceviren bir method oluşturun
         */
        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();
        ogrenciMap=MapMethodDepo.soyisimleriBuyukHarfYap(ogrenciMap);
       MapMethodDepo.tumListeYazdir(ogrenciMap);
    }
}
