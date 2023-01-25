package day14_DoWileLoop_Scope;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {
        // kullanıcıdan istesiği kadar sayı alın ve toplayın
        //kullanıcı değer olarak 0 a basarsa islemi bitirin
        Scanner scan=new Scanner(System.in);

        int girilenSayi=1;
        int toplam=0;

        while (girilenSayi!=0){
            System.out.println("Lütfen toplamak için bir sayı giriniz");
            girilenSayi=scan.nextInt();

            toplam+=girilenSayi;
        }
        System.out.println("Girilen sayıların toplamı: "+toplam);


    }
}
