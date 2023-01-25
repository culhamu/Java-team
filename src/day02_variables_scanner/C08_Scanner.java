package day02_variables_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Dikdörtgenin İki Kenarını giriniz");
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        System.out.println("Dikdörtgenin Alanı : " + kenar2*kenar1);

    }
}
