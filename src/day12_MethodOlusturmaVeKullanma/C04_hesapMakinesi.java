package day12_MethodOlusturmaVeKullanma;

import java.util.Scanner;

public class C04_hesapMakinesi {
    public static void main(String[] args) {
        // kullanıcıdan iki sayı ve istediği işlemi alın bir method oluşturup
        //sayılara istediği işlemi alın sonucu döndürün
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 2 sayı giriniz");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        System.out.println("Lütfen bir işlem seçin +,-,*,/");
        char islem=scan.next().charAt(0);
        System.out.println(hesapMakinesi(sayi1, sayi2, islem));


    }public static double hesapMakinesi(double sayi1,double sayi2,char islem){
        switch (islem){
            case '+':
                return sayi1+sayi2;

            case '-':
                return sayi1-sayi2;

            case '*':
                return sayi1*sayi2;

            case '/':
                return sayi1/sayi2;

            default :
                return 0;
        }



    }
}
