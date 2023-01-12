package day34_MapsNestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C02_NestedMap {
    public static void main(String[] args) {
      /*  {
      Aşağıdaki body yi map olarak oluşturun
            "firstname" : "Ahmet",
                "lastname" : "Bulut",
                "totalprice" : 500,
                "depositpaid" : false,
                "bookingdates" : {
            "checkin" : "2021-06-01",
                    "checkout" : "2021-06-10"
        },
            "additionalneeds" : "wi-fi" }*/


        Map<String, String> bookingdatesMap = new HashMap<>();
        bookingdatesMap.put("checkin", "2021-06-01");
        bookingdatesMap.put("checkout", "2021-06-10");

        Map<String, Object> bookingMap = new HashMap<>();
        bookingMap.put("firstname", "Ahmet");
        bookingMap.put("lastname", "Bulut");
        bookingMap.put("totalprice", 500);
        bookingMap.put("depositpaid", false);
        bookingMap.put("bookingdates", bookingdatesMap);
        bookingMap.put("additionalneeds", "wi-fi");

        System.out.println(bookingMap);

        //isim bilgisini yazdıralım
        System.out.println(bookingMap.get("firstname"));//Ahmet

        //checkin bilgisini yazdırın
        //bookingMap inde ki value data türü Object seçtik
        //dolayısıyla bookingdates key ine ait value nun Object olarak bize getirir
        //ama biz onun map olduğunu biliyoruz
        //casting yapabiliriz

        System.out.println(((Map) bookingMap.get("bookingdates")).get("checkin"));//2021-06-01

        //checkout yazdırın
    }
}
