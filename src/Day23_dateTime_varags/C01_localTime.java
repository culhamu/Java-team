package Day23_dateTime_varags;

import java.time.LocalTime;

public class C01_localTime {
    public static void main(String[] args) {
        LocalTime zaman=LocalTime.now();
        System.out.println(zaman);//12:07:27.016891200

        System.out.println(zaman.getMinute());//8

        System.out.println(zaman.withMinute(0).withSecond(0));//12:00:00.166698400

        System.out.println(zaman.plusHours(100).plusMinutes(250));//20:20:49.324120100

        // bir for loop ile birden 10000 e kadar olan sayıları yanyama yazdırın
        // bu işlem için geçen zamanı bulun
        LocalTime baslangicZamani=LocalTime.now();
        System.out.println("Başlangıç: "+baslangicZamani);
        for (int i = 1; i <10000 ; i++) {
            System.out.print(i+ " ");

        }
        System.out.println("");
        LocalTime bitisZamani=LocalTime.now();
        System.out.println("bitiş: "+bitisZamani);

        System.out.println("Bitiş süresi "+(bitisZamani.getNano()-bitisZamani.getNano()));
    }
}
