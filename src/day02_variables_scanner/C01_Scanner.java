package day02_variables_scanner;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir ondalıklı sayi giriniz");
        double sayidbl= scan.nextDouble();
        System.out.println("Lütfen bir ondalıklı sayı giriniz");
        int sayiint= scan.nextInt();
        System.out.println("sayıların toplamı :"+(sayidbl+sayiint));
        System.out.println("sayıların çarpımı :"+sayiint*sayidbl);
    }
}
