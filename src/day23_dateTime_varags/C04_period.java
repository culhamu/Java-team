package day23_dateTime_varags;

import java.time.LocalDate;
import java.time.Period;

public class C04_period {
    public static void main(String[] args) {
        LocalDate dogumTarihi=LocalDate.of(1987,12,27);
        LocalDate ldt= LocalDate.now();
        Period yas=Period.between(dogumTarihi,ldt);

        System.out.println(yas);

        LocalDate baslangıc=LocalDate.of(2010,8,5);
        LocalDate bitis=LocalDate.of(2015,6,25);

        Period sure=Period.between(baslangıc,bitis);
        System.out.println(sure);


    }
}
