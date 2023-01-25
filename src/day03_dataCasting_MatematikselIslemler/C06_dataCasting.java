package day03_dataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C06_dataCasting {
    public static void main(String[] args) {
        /*

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir double sayı giriniz");
        double sayidbl=scan.nextDouble();
        System.out.println("Lütfen bir tamsayı giriniz");
        int sayiint=scan.nextInt();
        System.out.println((int)(sayidbl /sayiint));
    }
}
