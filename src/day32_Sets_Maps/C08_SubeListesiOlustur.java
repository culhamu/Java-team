package day32_Sets_Maps;

import java.util.Map;

public class C08_SubeListesiOlustur {
    public static void main(String[] args) {
        //verilen sınıf ve sube ismi ile sinif listesini yazdıran method oluştur

        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.sinifListesiMethodu(ogrenciMap,"10","k");
    }
}
