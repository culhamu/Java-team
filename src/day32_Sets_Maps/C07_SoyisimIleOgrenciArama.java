package day32_Sets_Maps;

import java.util.Map;

public class C07_SoyisimIleOgrenciArama {

    //ogrenciMap de aradığımız soy isim deki öğrencilerin
    //Isim ,Soyisim,sınıf ve şube lerini bir tablo olarak yazdıran bir method oluşturun

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.soyisimIleOgrenciListesiYazdirma(ogrenciMap,"Cem");
    }
}
