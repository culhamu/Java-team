package day02_variables_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Karesini Almak İstediğiniz SAyıyı Giriniz");
        double girilenSayi=scan.nextDouble();
        System.out.println("Girilen Sayının Karesi : "+ girilenSayi*girilenSayi);

    }
}
