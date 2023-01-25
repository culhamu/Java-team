package day14_DoWileLoop_Scope;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {
        // kullanıcıdan istesiği kadar sayı alın ve toplayın
        //kullanıcı değer olarak 0 a basarsa islemi bitirin
        Scanner scan=new Scanner(System.in);

        int girilenSayi=0;
        int toplam=0;
        do {
            System.out.println("Lütfen toplamak için tamsayı giriniz");
            girilenSayi=scan.nextInt();
            toplam+=girilenSayi;

        }while (girilenSayi!=0);
        System.out.println("Girilen sayıların toplamı: "+toplam);
        /*
        while ilk şart sağlanmazsa loop body hiç çalışmaz
        ama doWileLoop da önce body çalıştığı için şart yanlış olsa bile
         loop body si en az bir kere çalışmış olur
         */

    }
}
