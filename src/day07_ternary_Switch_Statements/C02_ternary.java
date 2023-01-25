package day07_ternary_Switch_Statements;

import java.util.Scanner;

public class C02_ternary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi= scan.nextInt();

        if (sayi%2==0) System.out.println("Sayi çift sayıdır");
        else System.out.println("sayı çifft sayı değildir");


    }
}
