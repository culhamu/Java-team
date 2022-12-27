package Day22_immutableClasses;

import java.time.LocalDate;

public class C05_localDate {
    public static void main(String[] args) {

        LocalDate tarih=LocalDate.now();
        System.out.println(tarih);//2022-12-19

        System.out.println(tarih.getDayOfWeek());
        System.out.println(tarih.getDayOfMonth());
        System.out.println(tarih.getMonth());
        System.out.println(tarih.getEra());
        System.out.println(tarih.getDayOfYear());
        System.out.println(tarih.getChronology());
        System.out.println(tarih.getMonthValue());


        System.out.println(tarih.withYear(2015));
        System.out.println(tarih.withDayOfMonth(15));
        System.out.println(tarih.withDayOfMonth(15).withYear(2015));


        System.out.println(tarih.isLeapYear());

        System.out.println(tarih.minusWeeks(5));// kursun başlangıcı
        System.out.println(tarih.minusDays(5));
        System.out.println(tarih.minusMonths(5));
        System.out.println(tarih.minusMonths(5).minusDays(5).minusYears(3));

        System.out.println(tarih.plusWeeks(19));//2023-05-01 kurs bitişi
        System.out.println(tarih.plusYears(5).plusMonths(5).plusWeeks(5).plusDays(5));

        LocalDate tarih1=LocalDate.of(1975,12,13);
        LocalDate tarih2=LocalDate.of(1975,12,18);

        System.out.println(tarih1.isBefore(tarih2)? "tarih1 daha eski" : "tarih2 daha eski");

        System.out.println(tarih1.isLeapYear());

        System.out.println(tarih.hashCode());
        System.out.println(tarih1.hashCode());
        System.out.println(tarih2.minusDays(5).hashCode());
    }
}
