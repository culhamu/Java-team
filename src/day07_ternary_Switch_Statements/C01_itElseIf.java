package day07_ternary_Switch_Statements;

import java.util.Scanner;

public class C01_itElseIf {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi= scan.nextInt();

        if (sayi>=0 && sayi<10){
            System.out.println("girilen sayı rakamdır");

        } else if (sayi>=10 && sayi<100) {
            System.out.println("sayı iki basamaklıdır");} else if (sayi>=100) {
            System.out.println("büyük sayı");}

        }

    }


