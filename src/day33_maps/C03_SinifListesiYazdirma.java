package day33_maps;

import day32_Sets_Maps.MapMethodDepo;

import java.util.Map;

public class C03_SinifListesiYazdirma {
    public static void main(String[] args) {
        //verilen siniftaki ogrencilerin no, isim, soyisim, bolumlerini
        // bir liste olarak yazdiran bir methohd oluşturun

        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();
        MapMethodDepo.sinifListesiYazdirma(ogrenciMap,"10");
    }
}
