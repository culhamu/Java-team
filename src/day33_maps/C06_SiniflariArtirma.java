package day33_maps;

import day32_Sets_Maps.MapMethodDepo;

import java.util.Map;

public class C06_SiniflariArtirma {
    public static void main(String[] args) {
        //ogrenci map'indeki tüm sınıf değerlerini 1 artırın
        //12. sınıf varsa sınıf bilgisini mezun yapın

        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();
        ogrenciMap=MapMethodDepo.siniflariArtir(ogrenciMap);
        System.out.println(ogrenciMap);
    }
}
