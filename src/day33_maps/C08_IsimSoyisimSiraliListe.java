package day33_maps;

import day32_Sets_Maps.MapMethodDepo;

import java.util.Map;

public class C08_IsimSoyisimSiraliListe {
    public static void main(String[] args) {
        /*
        tüm öğrenci listesini
        isim soyisim no sınıf sube bolum
        şeklinde siralı olarak yazdıran bir method oluşturun
         */
        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();
        MapMethodDepo.isimSoyisimSiraliListeYazdir(ogrenciMap);

    }
}
