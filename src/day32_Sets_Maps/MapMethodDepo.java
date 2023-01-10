package day32_Sets_Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapMethodDepo {
    //Bizze öğrenciMap döndüren bir method oluşturun

    public static Map<Integer,String> ogrenciMapOlustur(){
        Map<Integer,String> ogrenciMap=new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");


        return ogrenciMap;
    }

    public static boolean isimIleOgrenciArama(Map<Integer, String> ogrenciMap, String isim) {

        //1-tüm value leri bir collection olarak kaydedelim
        //[Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Cemal-Han-12-M-MF]
        Collection<String> valuesCollection=ogrenciMap.values();

        //2- for each kullanarak her bir value yi ele alalım
        //3- -'yi kullanarak split yapalim
        //4-Split yaptığımız arrayden isim bilgidsini alalım 0.index
        //5- eğer value den aldığımız isim aranan isim ile ayni ise
        //true döndürüp foreach i bitirelim
        //6-for each bittiğinde true olmadıysa false döndürelim

        for (String eachValue:valuesCollection) {

            String[] valueArr=eachValue.split("-");
            String valuedekiIsim=valueArr[0];
            if (valuedekiIsim.equalsIgnoreCase(isim)){
                return true;
            }

        }return false;


    }

    public static void soyisimIleOgrenciListesiYazdirma(Map<Integer, String> ogrenciMap, String soyisim) {

        //1- map deki value leri bir collection olarak kaydedelim
        Collection<String> ogrenciValueCollection=ogrenciMap.values();
        //listenin ilk satırı olarak başlıkları yazdıralım
        System.out.println("İsim Soyisim Sınıf Şube");

        //2- for each ile herbir value bilgisini ele alalım
        //3- value yi - ile split yapıp bir array elde edelim
        //4- array in 1.index indeki soyisme bakıp aranan soyisim ile aynı ise
        //isim soyisim sınıf ve şube bilgilerni yazdıralım

        for (String eachValue:ogrenciValueCollection) {
            String[] valueArr=eachValue.split("-");
            String valueSoyisim=valueArr[1];
            if (valueSoyisim.equalsIgnoreCase(soyisim)){
                System.out.println(valueArr[0]+" "+valueArr[1]+" "+valueArr[2]+" "+valueArr[3]);
            }

        }
    }
}
